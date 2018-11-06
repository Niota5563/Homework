package com.htp.FirstDay;

public class Task9 {
    public static void main(String[] args) {
        int first = 10;
        int second = 20;
        int third = first;
        System.out.println(first + "  " + second);
        first = second;
        second = third;
        System.out.println(first + "  " + second);
    }
}