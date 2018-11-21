package com.htp.secondday;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int mass[] = {20, 20, 10, 10};
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        average = sum / mass.length;
        System.out.println("сумма элеменов: " + sum);
        System.out.println("среднее значение: " + average);
    }

}
