package com.htp.FirstDay;

public class Task2 {
    public static void main(String[] args) {
        double[] mass = {1, 2, 4, 8, 16, 32, 64};
        for (double element : mass) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        for (double element : mass) {
            element += element * 0.1;
            System.out.print(element + " ");
        }
    }
}
