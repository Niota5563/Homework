package com.htp.FourthDay.entity;

import java.util.Objects;

public abstract class Transport {
    private String model;
    private String mark;
    private String colour;
    private double price;

    public Transport() {
    }

    public Transport(String mark, String model, String colour, double price) {
        this.model = model;
        this.mark = mark;
        this.colour = colour;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.price, price) == 0 &&
                Objects.equals(model, transport.model) &&
                Objects.equals(mark, transport.mark) &&
                Objects.equals(colour, transport.colour);
    }

    @Override
    public int hashCode() {

        return Objects.hash(model, mark, colour, price);
    }

    @Override
    public String toString() {
        return "Транспорт " +
                " марка: " + mark +
                ", модель: " + model +
                ", цвет: " + colour +
                ", цена: " + price + " $";
    }

    public abstract void doSomething();
}
