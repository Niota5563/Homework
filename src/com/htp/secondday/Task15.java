package com.htp.secondday;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int []mass1 ={1,2,3};
        int []mass2 ={4,5,3};

        System.out.println("первый массив: " + Arrays.toString(mass1));
        System.out.println("второй массив: " + Arrays.toString(mass2));

        for (int i = 0; i < mass1.length; i++)
        {
            for (int j = 0; j <mass2.length;j++)
            {
                if (mass1[i] == (mass2[j]))
                {
                    System.out.println("Повторяющийся элемент: " +mass1[i]);
                }
            }
        }

    }
}
