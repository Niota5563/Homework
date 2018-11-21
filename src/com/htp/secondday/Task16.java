package com.htp.secondday;

import java.util.Arrays;

public class Task16 {
    public static void main(String[] args) {
        int[] mass = {10, 20, 30, 20, 10};

        int repeat = mass.length;
        System.out.println("Оригинал: " + Arrays.toString(mass));
        for (int i = 0; i < repeat; i++) {

            for (int j = i + 1; j < repeat; j++) {
                if (mass[i] == mass[j]) {

                    mass[j] = mass[repeat - 1];

                    repeat--;

                    j--;
                }
            }
        }
        int[] newMass = Arrays.copyOf(mass, repeat);
        System.out.println("Массив без повторов: " + Arrays.toString(newMass));
    }
}
