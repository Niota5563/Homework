package com.htp.FourthDay;

import com.htp.FourthDay.entity.Transport;
import com.htp.FourthDay.entity.car.Car;
import com.htp.FourthDay.entity.car.TypeOfCar;
import com.htp.FourthDay.entity.moto.Motorcycle;
import com.htp.FourthDay.entity.moto.TypeOfMoto;

public class Garage {
    public static void main(String[] args) {
        Transport[] transports = new Transport[3];
        transports[0] = new Motorcycle("Honda", "CBR-1000R", "red", 8000, TypeOfMoto.SPORT, 1000);
        transports[1] = new Car("BMW", "x5", "black", 40000, TypeOfCar.HATCHBACK, 5, 5);
        transports[2] = new Car("Lada", "new", "brown", 3000, TypeOfCar.UNIVERSAL, 0, 1);
        for (int i = 0; i < transports.length; i++) {
            System.out.println(transports[i]);
            transports[i].doSomething();
        }
        System.out.println("\nСортировка по цене: \n");
        Transport[] sortedMass = new Transport[transports.length];
        for (int i = 0; i < transports.length; i++) {
            int maxPrice = 0;
            int numberOfMaxPrice = 0;
            for (int j = 0; j < transports.length; j++) {
                if ((int) transports[j].getPrice() > maxPrice) {
                    maxPrice = (int) transports[j].getPrice();
                    numberOfMaxPrice = j;
                }
            }
            sortedMass[i] = transports[numberOfMaxPrice];
            transports[numberOfMaxPrice] = new Car();
        }

        for (int i = 0; i < sortedMass.length; i++) {
            System.out.println(sortedMass[i]);
        }
    }
}
