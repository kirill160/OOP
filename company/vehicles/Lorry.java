package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car {
private int weight;

    public Lorry(String carCLass, Engine engine, String brand, Driver driver, int weight) {
        super(carCLass, engine, brand, driver);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carCLass='" + carCLass + '\'' +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                ", driver=" + driver +
                ", weight=" + weight +
                '}';
    }
}
