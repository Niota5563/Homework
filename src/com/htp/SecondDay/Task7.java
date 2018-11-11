package com.htp.SecondDay;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int[] mass = {5, 10, 15, 20, 25};

        System.out.println("Оригинал: " + Arrays.toString(mass));

        Scanner input = new Scanner(System.in);
        System.out.print("\nВведите индекс элемента который хотите удалить(0-4): ");
        int num = input.nextInt();
        if (num > 4 || num < 0) {
            System.out.println("\nВведен неверный индекс!");

        } else {
            int[] newMass;
            newMass = new int[4];
            int a = 0;

            for (int i = 0; i < mass.length; i++) {
                if (i != num) {
                    newMass[a] = mass[i];
                    a++;
                }
            }
            System.out.print("Массив без " + (num + 1) + " элемента: " + Arrays.toString(newMass));
        }
    }
}
