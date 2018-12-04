package com.htp.strings;

public class Ex3 {
    public static void main(String[] args) {
        String str1 = "простота1 - залог2 надежности3.";

        System.out.println("Оригинал: " + str1);

        int sum = 0;
        int length = str1.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            Character character = str1.charAt(i);

            if (Character.isDigit(character)) {
                result.append(character).append(" ");
                sum += Character.getNumericValue(character);
            }
        }

        System.out.println("Целые числа: " + result);
        System.out.println("Сумма целых чисел: " + sum);
    }
}
