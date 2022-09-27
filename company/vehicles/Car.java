package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String carCLass;
    protected Engine engine;
    protected String brand;
    protected Driver driver;

    public Car(String carCLass, Engine engine, String brand, Driver driver) {
        this.carCLass = carCLass;
        this.engine = engine;
        this.brand = brand;
        this.driver = driver;
    }

    public void start(){
        System.out.println("поехали");
    }
    public void stop(){
        System.out.println("остановить");
    }
    public void turnRight(){
        System.out.println("повернули направо");
    }
    public void turnLeft(){
        System.out.println("повернули налево");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carCLass='" + carCLass + '\'' +
                ", engine=" + engine +
                ", brand='" + brand + '\'' +
                ", driver=" + driver +
                '}';
    }
}
