package com.company.OOP;

public class Student {
    protected String firstName;
    protected String lastNAme;
    protected int group;
    protected double averageMark;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    public Student(){

    }

    public Student(String firstName, String lastNAme, int group, double averageMark) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.group = group;
        this.averageMark = averageMark;

    }

    public int getScholarship(){
        int grant;
        if(Math.abs(averageMark - 5.0) < 1E-5){
            grant = 100;
        }
        else {
            grant = 80;
        }
        return grant;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
