package com.htp.firstday;

public class Task3 {
    public static void main(String[] args) {
        int[] mass = {1,1,1,0,1,1,1};
        boolean yes = true;
        for (int i = 0; i < (mass.length+1)/2 && yes; i++)
        {
           yes = mass[i] == mass[mass.length-i-1];
        }
        System.out.println(yes? "это палиндром":"это не палиндром");
    }
}
