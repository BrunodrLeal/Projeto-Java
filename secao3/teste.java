
import java.util.Scanner;


public class teste {
    
    public static void mai(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        String escola = ""; // Isso deixa a String vazia sendo atribuio pelo Scanner porteriormente
        System.out.println("Qual o nome do aluno? ");
        nome = scanner.nextLine();

        System.out.println("Qual o nome da escola? ");
        escola = scanner.nextLine();

        System.out.println("Digite a Primeira Nota: ");
        double nota1 = scanner.nextDouble(); 
        
        System.out.println("Digite a Segunda Nota: ");
        double nota2 = scanner.nextDouble(); 
        
        System.out.println("Digite a Terceira Nota: ");
        double nota3 = scanner.nextDouble(); 
        double media = (nota1 + nota2 + nota3) /3;
        System.out.println("Sua média foi " + media);
        System.out.println("Aluno: " + nome + " | Escola: " + escola);
    
        scanner.close();
        }

    }
    
