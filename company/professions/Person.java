package com.company.professions;

public class Person {
    protected int age;
    protected String fullName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
    Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
