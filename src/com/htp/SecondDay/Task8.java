package com.htp.SecondDay;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArray = new int[10];

        System.out.println("Исходный массив: "+Arrays.toString(myArray));

        for(int i=0; i < myArray.length; i++) {
            newArray[i] = myArray[i];
        }
        System.out.println("Новый массив:    "+Arrays.toString(newArray));
    }
}

