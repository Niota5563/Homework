package com.htp.SecondDay;

public class Task5 {
    public static void main(String[] args) {
        int a = 30;
        int[] mass = {10,20,30,40,50};
        for (int i = 0; i < mass.length; i++){
            if (mass[i] == a){
                System.out.println("есть совпадение");
            }
            else {
                System.out.println("совпадений нету");
            }


        }
    }
}
