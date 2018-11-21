package com.htp.firstday;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

//        int a =25;
//        int b =30;
//        int c =20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первой переменной: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение второй переменной: ");
        int b = scanner.nextInt();
        System.out.println("Введите значение третьей переменной: ");
        int c = scanner.nextInt();

  int maximum = Math.max(a,Math.max(b, c));
        System.out.print("максимальное: " + maximum);

//
//        int[] mass = new int[20];
//        int max = 0;
//        for (int i = 0; i < mass.length; i++) {
//            mass[i] = (int) (Math.random() * 100 + 1);
//        }
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i] > max) {
//                max = mass[i];
//            }
//            System.out.println(mass[i]);
//        }
//        System.out.println("Max value = " + max);
    }
}
