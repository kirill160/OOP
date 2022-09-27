package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(150, "BMW");
        Driver driver = new Driver(25, "Иван Иванов", 5);
        Car car = new Car("lorry", engine, " volvo", driver );
        System.out.println(car);
        Car[] cars = new Car[2];
        cars[0] = new Lorry("lorry", engine, "volvo",driver,510);
        cars[1] = new SportCar("sportCar", engine, "bmw", driver, 250);
        for (Car value : cars) {
            value.turnLeft();
            value.stop();
            System.out.println(value);
        }
    }
}
