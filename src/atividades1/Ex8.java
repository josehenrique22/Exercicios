package atividades1;

import java.util.ArrayList;

public class Ex8 {
    public static void main(String[] args) {
        // Write a Java program to insert an element into the arrayList at frist position
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(11);
        ages.add(23);
        ages.add(42);

        // Antes de interar na primeira posição
        for (int i = 0; i < 1; i++) {
            System.out.println(ages);
        }

        ages.add(0, 44);

        // Depois de interar na primeira posição
        for (int i = 0; i < 1; i++) {
            System.out.println(ages);
        }
    }
}
