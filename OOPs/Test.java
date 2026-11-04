package com.javaInLessTime.OOPs;

public class Test {
    public static void main(String[] args){
        Car car = new Car();
        car.setColor("Grey");
        car.setCompany("TATA");
        car.setModel("Punch");
        car.setSpeed(170);
        car.setYear(2026);

        System.out.println(car.getCompany());
    }
}
