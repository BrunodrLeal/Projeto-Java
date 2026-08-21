package secao15;

import java.util.Scanner;

public class JogoDaForca {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String palavraSecreta = "JAVA";
    char[] palavraOculta = new char[palavraSecreta.length()]; // Array com a palavra oculta

    for(int i = 0; i < palavraSecreta.length();i++){
        palavraOculta[i] = '_';
    }

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

            if(!acertou) {
                tentativas--;
                System.out.println("Letra Incorreta.");
            } else{
                System.out.println("Letra Correta. ");
            }
        
            if(String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
                break;
            }
            
    }
            if(venceu){
                System.out.println("Parabéns, você venceu e ainda restavam " + tentativas + " tentativas.");
               
            }else {
                System.out.println("Você perdeu");
            }
            System.out.println("A palavra era: " + palavraSecreta);
            
    
        
        sc.close(); 
    }
}
