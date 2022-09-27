package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private int speed;

    public SportCar(String carCLass, Engine engine, String brand, Driver driver, int speed) {
        super(carCLass, engine, brand, driver);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carCLass='" + carCLass + '\'' +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                ", driver=" + driver +
                ", speed=" + speed +
                '}';
    }
}
