package com.htp.SecondDay;

public class Task12 {
    public static void main(String[] args) {
        int mass[] = {1,2,3,4,4,5,6,6};
        for (int i=0; i<mass.length-1; i++)
        {
            for (int j=i+1; j < mass.length; j++)
            {
                if ((mass[i] == mass[j]) && (i != j))
                {
                    System.out.println("повторяющиеся элементы: "+ mass[j]);
                }
            }
        }
    }
}
