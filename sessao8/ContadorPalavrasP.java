import java.util.Scanner;

public class ContadorPalavrasP {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        
            frase();
        
            System.out.println("Deseja digitar outra frase? ");
            
            String segFrase = scanner.nextLine();
        
        if (segFrase.equalsIgnoreCase("sim")){
            System.out.println("Digite outra frase? ");
            String segFrase1 = scanner.nextLine();
            System.out.println("Texto original: " + segFrase1);
            System.out.println("Números de caracteres: " + segFrase1.length());

        } else if (segFrase.equalsIgnoreCase("nao")) {

        System.out.println("Programa encerrado");
        System.out.println("obrigado");
        } else{
            System.out.println("Opção inválida.");
        }
        
        
    
}
    public static String[] frase () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase pra gente começar?");
            String frase = scanner.nextLine();
            String[] palavras = frase.trim().split("\\s+");
            int numeroPalavras = palavras.length;

        System.out.println("Texto original: " + frase);
        System.out.println("Números de caracteres: " + numeroPalavras + " palavras.");
            return palavras;
        }
}