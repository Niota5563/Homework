package com.htp.SecondDay;

public class Task2 {
    public static void main(String[] args) {

        int sum = 0;
        int mass[] = {20, 20, 10, 10};
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        System.out.println("сумма элеменов: " + sum);
    }
}
