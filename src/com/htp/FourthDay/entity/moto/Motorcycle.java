package com.htp.FourthDay.entity.moto;

import com.htp.FourthDay.entity.Transport;

import java.util.Objects;

public class Motorcycle extends Transport {

    private TypeOfMoto type;
    private double volumeOfMotor;

    public Motorcycle() {
    }

    public Motorcycle(String mark, String model, String colour, double price, TypeOfMoto type, double volumeOfMotor) {
        super(mark, model, colour, price);
        this.type = type;
        this.volumeOfMotor = volumeOfMotor;
    }

    public TypeOfMoto getType() {
        return type;
    }

    public void setType(TypeOfMoto type) {
        this.type = type;
    }

    public double getVolumeOfMotor() {
        return volumeOfMotor;
    }

    public void setVolumeOfMotor(double volumeOfMotor) {
        this.volumeOfMotor = volumeOfMotor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Motorcycle that = (Motorcycle) o;
        return Double.compare(that.volumeOfMotor, volumeOfMotor) == 0 &&
                type == that.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, volumeOfMotor);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", тип: " + type +
                ", объём двигателя: " + volumeOfMotor;
    }

    @Override
    public void doSomething() {
        System.out.println("Шапку надень, холодно же");
    }
}
