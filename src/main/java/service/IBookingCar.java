package service;

import entity.Client;
import entity.RentCars;

public interface IBookingCar {
    void book(RentCars rentCars, Client client, int numberOfPassengers);
}
