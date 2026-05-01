package Exercicios;
import java.util.*;

public class usuario {
public static void main (String[] args) {

int[] numeros = {1,2,3,4,5,6,7,8};
for(int i = 0; i < numeros.length;i++) {

}
numeros [4] = 99;
System.out.println(Arrays.toString(numeros));

numeros [2] = 87;
numeros [7] = 65;
System.out.println(Arrays.toString(numeros));

int soma = 0;
for(int i = 0; i < numeros.length; i++){
    soma += numeros[i];
}
System.out.println("A soma é: " + soma);

int somase = numeros[1]+ numeros[4] + numeros [8];
System.out.println("A soma é: " + somase);


    }
}