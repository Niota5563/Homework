package com.htp.secondday;

public class Task18 {
    public static void main(String[] args) {

        int[]mass = {1,2,3,4,5,6};
        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < mass.length; i++)
        {
            if (mass[i]==min)
            {
                second = min;
            }
            else if (mass[i] < min)
            {
                second = min;
                min = mass[i];
            }
            else if (mass[i] < second)
            {
                second = mass[i];
            }
        }
        System.out.println("второй минимальный элемент: " + second);
    }
}
