import entity.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bill amyBill = new Bill(10000);
        Client amyClient = new Client("Amy", "Wong", "+00000", "amy@gmail.com", amyBill);

        Bill lilaBill = new Bill(8000);
        Client lilaClient = new Client("Lila", "Turanga", "+11111", "lila@gmail.com", lilaBill);

        List<Cars> japanCar = new ArrayList<>();
        japanCar.add(new Cars(2, 3500, true, TransmissionType.AUTOMATIC));
        japanCar.add(new Cars(4, 1700, true, TransmissionType.MANUAL));
        japanCar.add(new Cars(2, 5000, true, TransmissionType.MANUAL));
        RentCars japanRentCars = new RentCars("Honda", japanCar);

        List<Cars> mercedesCar = new ArrayList<>();
        mercedesCar.add(new Cars(2, 4500, true, TransmissionType.AUTOMATIC));
        mercedesCar.add(new Cars(4, 2700, true, TransmissionType.AUTOMATIC));
        mercedesCar.add(new Cars(2, 10000, true, TransmissionType.MANUAL));
        RentCars germanyRendCars = new RentCars("Mercedes", mercedesCar);
    }
}