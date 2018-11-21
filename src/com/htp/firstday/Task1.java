package com.htp.firstday;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение: ");
        double yourWeightOnEarth = scanner.nextDouble();
        double yourWeightOnMoon = yourWeightOnEarth * 0.16;
        System.out.println("Ваш вес на Земле равен " + yourWeightOnEarth + " кг,при этом ваш вес на Луне равен " + yourWeightOnMoon + " кг.");
        scanner.close();
    }
}
