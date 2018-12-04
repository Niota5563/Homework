package com.htp.collections.books;

import java.util.Objects;

public class Book {
    private String title;
    private double price;
    private String name;
    private String surname;

    public Book() {
    }

    public Book(String title, double price, String name, String surname) {
        this.title = title;
        this.price = price;
        this.name = name;
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(name, book.name) &&
                Objects.equals(surname, book.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, price, name, surname);
    }

    @Override
    public String toString() {
        return
                "Название: " + title +
                ", цена: " + price +
                ", автор: " + name + " " + surname
                ;
    }
}

