package service;

import entity.Bill;
import entity.Cars;
import entity.Client;
import entity.RentCars;

import java.util.logging.Logger;

import java.util.List;

public class BookingCar implements IBookingCar {

    private static final Logger logger = Logger.getLogger(BookingCar.class.getName());

    // проверяем ли есть свободные машины
    @Override
    public void book(RentCars rentCars, Client client, int numberOfPassengers) {
        try {
            List<Cars> cars = rentCars.getCars();
            boolean isFreeCars = false;
            for (Cars car : cars) {
                if (car.isFree()) {
                    isFreeCars = true;
                    break;
                }
            }
            if (!isFreeCars) {
                // System.out.println("no free cars in " + rentCars.getCars());
                logger.info("❌ no free cars in " + rentCars.getCars());
            }
            bookCar(client, numberOfPassengers, cars);
        } catch (Exception e) {
            logger.info("❌ Error: " + e.getMessage());
        }
    }

    // проверяем ли хватает денег на бронь и снимаем со счета и вызываем выше
    private static void bookCar(Client client, int numberOfPassengers, List<Cars> cars) {
        boolean success = false;
        for (Cars car : cars) {
            if (car.getCountOfSeats() == numberOfPassengers) {
                success = true;
//                System.out.println("We found such car for " + client.getName());
                logger.info(
                        "\n=== Booking Success ===\n" +
                                "Client: " + client.getName() + "\n" +
                                "Car seats: " + car.getCountOfSeats() + "\n" +
                                "Cost: " + car.getCostForRent() + "\n" +
                                "Remaining balance: " + client.getBill().getAmount() + "\n" +
                                "======================="
                );
                if (client.getBill().getAmount() >= car.getCostForRent()) {
                    Bill clientBill = client.getBill();
//                    System.out.println("on the client Bill " + clientBill.getAmount());
                    logger.info("On the client Bill " + clientBill.getAmount());
                    clientBill.setAmount(clientBill.getAmount() - car.getCostForRent());
                    car.setFree(false);
//                    System.out.println("Car has been successfully booked by " + client.getName() + " on the card " + client.getBill().getAmount());
                    logger.info("✅ Car has been successfully booked by " + client.getName() + " on the card " + client.getBill().getAmount());
                    break;
                } else {
//                    System.out.println("Not enough money for booking the car " + client.getName());
                    logger.info(" ❌ Not enough money for booking the car " + client.getName());
                }
            }
        }
        if (!success) {
            System.out.println("❌ No car for client " + client.getName());
        }
    }
}
