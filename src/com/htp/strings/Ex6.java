package com.htp.strings;

import java.util.HashMap;
import java.util.Map;

public class Ex6 {
    public static void main(String[] args) {
        String str1 = "простота - залог надежности. Dijkstra Dijkstra";

        System.out.println("Оригинал: " + str1);

        System.out.println("Кол-во слов в строке :");
        String[] words = str1.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");

        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                Integer counter = counterMap.get(word);
                if (counter == null) {
                    counter = 0;
                }
                counterMap.put(word, ++counter);
            }
        }

        for (String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}
