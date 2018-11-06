package com.htp.SecondDay;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int index = 5;
        int newValue = 10;

        System.out.println("Исходный массив: "+Arrays.toString(myArray));

        for(int i=myArray.length-1; i > index; i--){
            myArray[i] = myArray[i-1];
        }
        myArray[index] = newValue;
        System.out.println("Новый массив:    "+Arrays.toString(myArray));
    }
}
