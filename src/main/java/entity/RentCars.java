package entity;

import java.util.List;

public class RentCars {

//    private String ModelCar;
    private CarBrand carBrand;

    private List<Cars> cars;

    public RentCars(CarBrand carBrand, List<Cars> cars) {
        this.carBrand = carBrand;
        this.cars = cars;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }
}
