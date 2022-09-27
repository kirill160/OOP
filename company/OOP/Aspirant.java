package com.company.OOP;

public class Aspirant extends Student{
    Aspirant(){

    }
    public Aspirant(String firstName, String lastNAme, int group, double averageMark) {
        super(firstName, lastNAme, group, averageMark);
    }

    @Override
    public int getScholarship() {
        int grant;
        if(Math.abs(averageMark - 5.0) < 1E-5){
            grant = 200;
        }
        else {
            grant = 180;
        }
        return grant;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
