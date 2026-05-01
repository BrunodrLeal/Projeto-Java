package Exercicios;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,2,4,5,1,6,3,7,8,5};

        ArrayList<Integer> vistos = new ArrayList<>();
        ArrayList<Integer> repetidos = new ArrayList<>();

        for (int numero : numeros) {

            if (vistos.contains(numero)) {
                // primeira vez que aparece
                vistos.add(numero);

            } else {
                // já apareceu antes → é repetido

                if (repetidos.contains(numero)) {
                    repetidos.add(numero);
                }
            }
        }

        System.out.println("Repetidos: " + repetidos);
        System.out.println("vistos: "+ vistos);
    }
}