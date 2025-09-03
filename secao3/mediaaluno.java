import java.util.Scanner;
// Obter nome do aluno e 3 notas
// Exibir mensagem com nome e média final
// Bônus : Se a nota for maior ou igual a 7, imprimir Aprovao, se não: Reprovado

public class mediaaluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = ""; //vazia
        String escola = ""; //vazia

        while (!nome.equalsIgnoreCase("Bruno")) {
            System.out.println("Qual o seu nome?");
            nome = scanner.nextLine();

            System.out.println("Olá " + nome + ", qual escola você estuda?");
            escola = scanner.nextLine();

            if (!escola.equalsIgnoreCase("Yolanda")) {
                System.out.println(">>> A escola \"" + escola + "\" não é aceita.");
                System.out.println(">>> Por favor, informe a escola correta (dica: começa com 'Y').\n");
            }
        }

        System.out.println("Que escola maravilhosa :) !!!");

        // Continua com as notas
        System.out.println("Qual é a primeira Nota do aluno?");
        double nota1 = scanner.nextDouble();

        System.out.println("Qual é a segunda Nota do aluno?");
        double nota2 = scanner.nextDouble();

        System.out.println("Qual é a terceira Nota do aluno?");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 8.0) {
            System.out.println("Sua média foi " + media + ". Você foi aprovado, parabéns :) !!!");
        } else {
            System.out.println("Sua média foi " + media + ". Infelizmente, você não alcançou a média.");
        }

        scanner.close();
    }
}
