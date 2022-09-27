package com.company.professions;

public class Driver extends Person {
    private int exp;
    Driver(){

    }

    @Override
    public String toString() {
        return "Driver{" +
                "exp=" + exp +
                ", age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public Driver(int age, String fullName, int exp) {
        super(age, fullName);
        this.exp = exp;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
