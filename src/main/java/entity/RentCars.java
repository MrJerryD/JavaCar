package entity;

import java.util.List;

public class RentCars {

    private String ModelCar;

    private List<Cars> cars;

    public RentCars(String modelCar, List<Cars> cars) {
        ModelCar = modelCar;
        this.cars = cars;
    }

    public String getModelCar() {
        return ModelCar;
    }

    public void setModelCar(String modelCar) {
        ModelCar = modelCar;
    }

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }
}
