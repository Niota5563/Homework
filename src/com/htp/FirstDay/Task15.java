package com.htp.FirstDay;

public class Task15 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("\n");
        do {
            System.out.print(i + " ");
            i--;
        }
        while (i > 0);
        System.out.println("\n");
        for (i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
    }
}
