package com.htp.secondday;

public class Task3 {
    public static void main(String[] args) {

        String[][] mass = {
                {"+","+","+","+"},
                {"+","+","+","+"},
                {"+","+","+","+"},
                {"+","+","+","+"}

        };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mass[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
