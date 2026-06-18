package pratica1;
import java.util.*;
public class Pratica2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Me dê uma palavra: ");
        String palavra = sc.nextLine();
        for(int i = 0; i < palavra.length();i++){

        }
        System.out.println("Essa palavra tem " + palavra.length()+ " caracteres");
        System.out.println("Palavra maiúscula "+ palavra.toUpperCase());
        System.out.println("Palavra minúscula "+ palavra.toLowerCase());
        Palindromo(sc);

    }
    public static void Palindromo(Scanner sc){
        String palavraInvertida = "";
        System.out.println("Escreva uma palavra vou checar se é um palindromo.");
        String palavra = sc.nextLine();
        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        if(palavraInvertida.equals(palavra)){
            System.out.println("É um palindromo");
        } else{
            System.out.println("Não é um palindromo");
        }

    }
}

