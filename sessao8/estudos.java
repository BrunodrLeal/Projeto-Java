import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class estudos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Pega alunos
        ArrayList<String> alunos = alunos(sc);

        // 2. Pega disciplinas
        ArrayList<String> disciplinas = disciplinas(sc);

        // 3. Pega notas
        HashMap<String, ArrayList<Double>> notas = notas(sc, alunos, disciplinas);

        // 4. Mostra resultado final
        resultado(alunos, disciplinas, notas);

        sc.close();
    }

    // Função 1: pega alunos
    public static ArrayList<String> alunos(Scanner sc) {
        ArrayList<String> alunos = new ArrayList<>();
        System.out.print("Quantos alunos são? ");
        int qtdeAlunos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdeAlunos; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            alunos.add(sc.nextLine());
        }
        return alunos;
    }

    // Função 2: pega disciplinas
    public static ArrayList<String> disciplinas(Scanner sc) {
        ArrayList<String> disciplinas = new ArrayList<>();
        System.out.print("Quantas disciplinas deseja adicionar? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome da disciplina " + (i + 1) + ": ");
            disciplinas.add(sc.nextLine());
        }
        return disciplinas;
    }

    // Função 3: pega notas
    public static HashMap<String, ArrayList<Double>> notas(Scanner sc, ArrayList<String> alunos, ArrayList<String> disciplinas) {
        HashMap<String, ArrayList<Double>> notas = new HashMap<>();

        for (String aluno : alunos) {
            ArrayList<Double> notasAluno = new ArrayList<>();
            for (String disc : disciplinas) {
                System.out.print("Digite a nota de " + aluno + " em " + disc + ": ");
                double nota = sc.nextDouble();
                notasAluno.add(nota);
            }
            notas.put(aluno, notasAluno);
        }
        return notas;
    }

    // Função 4: exibe resultado alinhado
    public static void resultado(ArrayList<String> alunos, ArrayList<String> disciplinas, HashMap<String, ArrayList<Double>> notas) {
        System.out.println("\n===== BOLETIM FINAL =====");

        // Cabeçalho
        System.out.print(String.format("%-15s", "Aluno"));
        for (String disc : disciplinas) {
            System.out.print(String.format("%-15s", disc));
        }
        System.out.print(String.format("%-15s", "Soma"));
        System.out.print(String.format("%-15s", "Média"));
        System.out.print(String.format("%-15s", "Situação"));
        System.out.println();

        // Linhas com notas + soma + média + situação
        for (String aluno : alunos) {
            System.out.print(String.format("%-15s", aluno));
            ArrayList<Double> notasAluno = notas.get(aluno);

            double soma = 0;
            for (Double n : notasAluno) {
                System.out.print(String.format("%-15.2f", n));
                soma += n;
            }

            double media = soma / notasAluno.size();
            String situacao;

            if (soma < 10) {
                situacao = "Reprovado";
            } else if (soma <= 20) {
                situacao = "Recuperação";
            } else {
                situacao = "Aprovado";
            }

            System.out.print(String.format("%-15.2f", soma));
            System.out.print(String.format("%-15.2f", media));
            System.out.print(String.format("%-15s", situacao));
            System.out.println();
        }
    }
}
