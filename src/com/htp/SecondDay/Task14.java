package com.htp.SecondDay;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        String[]mass1 ={"one","two","three"};
        String[]mass2 ={"four","one","five"};

        System.out.println("первый массив: " + Arrays.toString(mass1));
        System.out.println("второй массив: " + Arrays.toString(mass2));

        for (int i = 0; i < mass1.length; i++)
        {
            for (int j = 0; j <mass2.length;j++)
            {
                if (mass1[i].equals(mass2[j]))
                {
                    System.out.println("Повторяющийся элемент: " +mass1[i]);
                }
            }
        }

    }
}
