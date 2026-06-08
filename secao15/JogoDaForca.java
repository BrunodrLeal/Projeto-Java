package secao15;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class JogoDaForca {

public static void main(String[] args) {

    ArrayList<Integer> vezes =new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String palavraSecreta = "JAVA";
    char[] palavraOculta = new char[palavraSecreta.length()]; // Array com a palavra oculta

    for(int i = 0; i < palavraSecreta.length();i++){
        palavraOculta[i] = '_';
    }
    System.out.println(Arrays.toString(palavraOculta));

    int tentativas = 6;
    boolean venceu = false;
    

    while(tentativas > 0) {
        System.out.println(" Palavra: " + String.valueOf(palavraOculta));
        System.out.println("Tentativas Restantes: " + tentativas);
        System.out.println("Digite uma letra: ");
           
        char letra = sc.next().toUpperCase().charAt(0);

        System.out.println(letra);
        boolean acertou =false;

        for(int i = 0; i < palavraSecreta.length();i++){
            
            if(palavraSecreta.charAt(i) == letra){
                palavraOculta[i] = letra;
                acertou = true;
        }        
    }
    System.out.println("Teste: " + String.valueOf(palavraOculta));

        tentativas--;
        } 
    }
}
