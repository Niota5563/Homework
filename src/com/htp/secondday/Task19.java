package com.htp.secondday;

public class Task19 {
    public static void main(String[] args) {

        String[][] mass = {
                {"+", "+", "+", "+"},
                {"+", "+", "+", "+"},
                {"+", "+", "+", "+"},
                {"+", "+", "+", "+"}

        };

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");

            String[][] copy = new String[4][4];

            System.arraycopy(mass, 0, copy, 0, 4);

            for (int i = 0; i < copy.length; i++) {
                for (int j = 0; j < copy[i].length; j++) {
                    System.out.print(copy[i][j]+"\t");
                }
                System.out.println();
            }


    }
}