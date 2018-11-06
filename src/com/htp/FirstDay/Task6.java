package com.htp.FirstDay;

public class Task6 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        for (int i = 1; i < mass.length; i = i + 2) {
            System.out.println(mass[i]);
        }

    }
}
