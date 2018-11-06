package com.htp.SecondDay;

public class Task10 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100 + 1);
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        int min = mass[0];
        for (int i = 0 ; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
            System.out.println(+mass[i]);
        }

        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }
}
