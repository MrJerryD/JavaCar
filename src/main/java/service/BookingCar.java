package service;

import entity.Bill;
import entity.Cars;
import entity.Client;
import entity.RentCars;

import java.util.List;

public class BookingCar implements IBookingCar {

    @Override
    public void book(RentCars rentCars, Client client, int numberOfPassengers){
        // проверяем ли есть свободные машины
        List<Cars> cars = rentCars.getCars();
        boolean isFreeCars = false;
        for (Cars car : cars) {
            if(car.isFree()){
                isFreeCars = true;
            }
        }

        if(!isFreeCars){
            System.out.println("no free cars in " + rentCars.getCars());
        }

        bookCar(client, numberOfPassengers, cars);
    }

        // проверяем ли хватает денег на бронь и снимаем со счета и вызываем выше
    private static void bookCar(Client client, int numberOfPassengers, List<Cars> cars) {
        boolean success = false;
        for (Cars car : cars) {
            if(car.getCountOfSeats() == numberOfPassengers){
                success = true;
                System.out.println("We found such car for " + client.getName());
                if(client.getBill().getAmount() >= car.getCostForRent()){
                    Bill clientBill = client.getBill();
                    System.out.println("on the client Bill " + clientBill.getAmount());
                    clientBill.setAmount(clientBill.getAmount() - car.getCostForRent());
                    car.setFree(false);
                    System.out.println("Car has been successfully booked by " + client.getName() + " on the card " + client.getBill().getAmount());
                }else {
                    System.out.println("Not enough money for booking the car " + client.getName());
                }
            }
        }
        if(!success){
            System.out.println("no car for client " + client.getName());
        }
    }
}
