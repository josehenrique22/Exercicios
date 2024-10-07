package atividades1;

import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {
        // Escreva um programa Java para recuperar um elemento (em um índice especificado) de uma determinada lista de arrays.
        ArrayList<String> comidas = new ArrayList<String>();

        comidas.add("Banana");
        comidas.add("Bife");
        comidas.add("Leite");

        String getFirstElement = comidas.getFirst();

        System.out.println(getFirstElement);

    }
}
