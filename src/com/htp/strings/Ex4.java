package com.htp.strings;

public class Ex4 {
    public static void main(String[] args) {
        String str1 = "простота - залог надежности.";

        System.out.println("Оригинал: " + str1);

        int k = 2;
        char symbol = '@';

        String newStr = str1.replaceAll(String.format("(\\b\\p{L}{%d})\\p{L}", k - 1), "$1" + symbol);
        System.out.println("Замена 2-ого символа на @: " + newStr);
    }
}
