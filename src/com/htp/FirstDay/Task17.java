package com.htp.FirstDay;

public class Task17 {
    public static void main(String[] args) {
        double mass[] = new double[100];
        double max = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 100 + 1);
            System.out.print(mass[i] + " ");
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println("\n");
        System.out.println("максимальное: " +max);
        System.out.println("\n");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = mass[i] / max;
            System.out.print(mass[i] + " ");
        }
    }
}
