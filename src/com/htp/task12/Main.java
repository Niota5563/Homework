package com.htp.task12;

import com.htp.task12.entity.Body;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Body> listA = new ArrayList<>();

        listA.add(new Body("aaa"));
        listA.add(new Body("bbb"));
        listA.add(new Body("ccc"));

        List<Body> listB = new ArrayList<>();

        listB.add(new Body("ccc"));
        listB.add(new Body("ddd"));
        listB.add(new Body("eee"));

        listB.removeAll(listA);
        listA.addAll(listB);
        System.out.println(listA);

        HashMap<String, String> hashMapA = new HashMap<>();

        hashMapA.put("1", "aaa");
        hashMapA.put("2", "bbb");
        hashMapA.put("3", "ccc");

        HashMap<String, String> hashMapB = new HashMap<>();

        hashMapB.put("3", "ccc");
        hashMapB.put("4", "ddd");
        hashMapB.put("5", "eee");

        HashMap<String, String> hashMapC = new HashMap<>();
        hashMapC.putAll(hashMapA);
        hashMapC.putAll(hashMapB);

        System.out.println(hashMapC);
    }
}
