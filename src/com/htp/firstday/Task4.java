package com.htp.firstday;

public class Task4 {
    public static void main(String[] args) {
        int[] mass = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i + 1;
        }
        for (int element : mass) {
            if (element % 2 == 0) {
                System.out.println(element);
            }
        }
    }
}
