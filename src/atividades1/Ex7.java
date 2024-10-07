package atividades1;

import java.util.ArrayList;

public class Ex7 {
    // Crie um arraylist, adicione algumas cor e imprime no console

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        for (String printColors : colors) {
            System.out.println(printColors);
        }
    }
}
