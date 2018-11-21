package com.htp.secondday;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args){
        int[] array = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        System.out.println("Оригинальный массив: "+Arrays.toString(array));
        for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Перевернутый массив: "+Arrays.toString(array));
    }
}
