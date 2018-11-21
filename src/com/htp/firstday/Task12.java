package com.htp.firstday;

public class Task12 {
    public static void main(String[] args) {
        boolean[] mass = {true, false, true, true, false, false};

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == true) {
                System.out.println("истина");
            } else {
                System.out.println("ложь");
            }
        }
    }
}