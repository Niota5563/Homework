package com.htp.FirstDay;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите минимальное значение: ");
        int min = scanner.nextInt();
        System.out.println("введите максимальное значение: ");
        int max = scanner.nextInt();
        System.out.println("введите шаг: ");
        int step = scanner.nextInt();
        while (max >= min) {
            System.out.print(min + " ");
            min += step;
        }
    }
}