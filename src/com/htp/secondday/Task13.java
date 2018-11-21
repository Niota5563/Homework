package com.htp.secondday;

public class Task13 {
    public static void main(String[] args) {
        String[] mass = {"one","two","three","four","five","five"};
        for (int i = 0; i <mass.length-1;i++)
        {
            for (int j=i+1; j <mass.length;j++)
            {
                if ((mass[i].equals(mass[j])) && (i!=j))
                {
                    System.out.println("повторяющиеся элементы: "+mass[i]);
                }
            }
        }
    }
}
