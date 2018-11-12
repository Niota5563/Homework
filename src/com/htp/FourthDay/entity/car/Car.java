package com.htp.FourthDay.entity.car;

import com.htp.FourthDay.entity.Transport;

import java.util.Objects;

public class Car extends Transport {

    private TypeOfCar type;
    private int numberOfDoors;
    private int numberOfSeats;

    public Car() {
    }

    public Car(String mark, String model, String colour, double price, TypeOfCar type, int numberOfDoors, int numberOfSeats) {
        super(mark, model, colour, price);
        this.type = type;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
    }

    public TypeOfCar getType() {
        return type;
    }

    public void setType(TypeOfCar type) {
        this.type = type;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return type == car.type &&
                Objects.equals(numberOfDoors, car.numberOfDoors) &&
                Objects.equals(numberOfSeats, car.numberOfSeats);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, numberOfDoors, numberOfSeats);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", тип: " + type +
                ", количество дверей: " + numberOfDoors +
                ", количество мест: " + numberOfSeats ;
    }

    @Override
    public void doSomething() {
        System.out.println("Врум врум.... едем дальше");
    }
}
