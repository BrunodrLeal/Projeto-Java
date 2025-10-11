import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        boolean rodando = true;
        int tentativas = 0;
        int numero = rd.nextInt(100)+1;
        
        while (rodando) {
            System.out.println("Escreva um número aleatório de 1 a 100:");
            int num1 = sc.nextInt();
            tentativas++;

            if (num1 == numero) {
                System.out.println("Parabéns, você acertou!");
                rodando = false; // encerra só quando acertar
            }
            else if (num1 < 1 || num1 > 100) {
                System.out.println("Opção inválida!");
            }
            else if (num1 <= 10) {
                System.out.println("Está muito longe");
            }
            else if (num1 <= 30) {
                System.out.println("Está longe");
            }
            else if (num1 <= 50) {
                System.out.println("Está morno!");
            }
            else if (num1 <= 70) {
                System.out.println("Está bem perto");
            }
            else if (num1 <= 75) {
                System.out.println("Está fervendo");
            }
            else {
                System.out.println("Passou um pouco...");
            }
        }

        System.out.println("Você tentou " + tentativas + " vezes.");
        sc.close();
    }
}