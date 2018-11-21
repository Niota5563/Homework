package com.htp.secondday;

public class Task17 {
    public static void main(String[] args) {

        int[]mass = {1,2,3,4,5,6};
        int max = 0, second=0;
        for (int i = 0; i < mass.length; i++)
        {
            if (mass[i] > max) {
                second = max;
                max = mass[i];
            }
        }
        System.out.println("второй максимальный элемент: " + second);
    }
}
