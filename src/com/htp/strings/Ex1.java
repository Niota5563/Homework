package com.htp.strings;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String str1 = "простота - залог надежности.";

        System.out.println("Оригинал: " + str1);

        System.out.print("Верхний регистр: ");

        Scanner lineScan = new Scanner(str1);

        while (lineScan.hasNext()) {
            String word = lineScan.next();
            String str2 = Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";

            System.out.print(str2);
        }
    }
}
