package com.htp.fourthday;

import com.htp.fourthday.entity.Transport;
import com.htp.fourthday.entity.TransportComparator;
import com.htp.fourthday.entity.car.Car;
import com.htp.fourthday.entity.car.TypeOfCar;
import com.htp.fourthday.entity.interfaces.Instruction;
import com.htp.fourthday.entity.moto.Motorcycle;
import com.htp.fourthday.entity.moto.TypeOfMoto;

import java.util.LinkedList;
import java.util.List;

public class Garage {


    public static void main(String[] args) {
        TransportComparator transportComparator = new TransportComparator();
        Instruction instructionForCar = new Car();
        Instruction instructionForMotorcycle = new Motorcycle();
        List<Transport> transports = new LinkedList<>();
        transports.add(new Motorcycle("Honda", "CBR-1000R", "red", 8000, TypeOfMoto.SPORT, 1000));
        transports.add(new Car("BMW", "x5", "black", 40000, TypeOfCar.HATCHBACK, 5, 5));
        transports.add(new Car("Lada", "new", "brown", 3000, TypeOfCar.UNIVERSAL, 0, 1));

        transports.forEach(System.out::println);

        System.out.println("\nСортировка по цене: \n");

        transports.sort(transportComparator);
        transports.forEach(System.out::println);

        System.out.println("\nОписание: \n");
        instructionForCar.getDescription();
        instructionForMotorcycle.getDescription();
    }
}
