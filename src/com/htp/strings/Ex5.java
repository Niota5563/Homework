package com.htp.strings;

public class Ex5 {
    public static void main(String[] args) {
        String str1 = "простота - залог надежности. (Dijkstra) *Dijkstra*";

        System.out.println("Оригинал: " + str1);

        String str2 = str1.replaceAll("\\(.*\\) \\*.*\\*", "");
        System.out.println("Без значений в скобках и *: " + str2);
    }
}
