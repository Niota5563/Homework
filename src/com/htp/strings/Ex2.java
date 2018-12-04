package com.htp.strings;

public class Ex2 {
    public static void main(String[] args) {
        String str1 = "простота - залог надежности.";

        System.out.println("Оригинал: " + str1);

        char[] punctuation = {'.', ',', '-', ':', ';', '?', '!'};
        int count = 0;

        char[] ch = str1.toCharArray();
        for (char aCh : ch) {
            for (char aPunctuation : punctuation) {
                if (aCh == aPunctuation) {
                    count++;
                }
            }
        }
        System.out.println("Знаков препинания : " + count);
    }
}
