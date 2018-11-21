package com.htp.secondday;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] mass= {1,8,10,15,34,13,8,6,2,4};
        for (int i = mass.length-1; i>0; i--){
            for(int j = 0; j < i; j++){
                if(mass[j]>mass[j+1]){
                    int temp = mass[j];
                    mass[j] = mass [j+1];
                    mass[j+1] = temp;
                }
            }
        }
        String massString = Arrays.toString(mass);
        System.out.println(massString);

        String[] array = {"day","night","hello","again","world"};
        Arrays.sort(array);
        String arrayString = Arrays.toString(array);
        System.out.println(arrayString);
    }
}
