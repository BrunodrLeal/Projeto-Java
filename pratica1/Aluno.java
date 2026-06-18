package pratica1;

import java.util.ArrayList;
import java.util.Scanner;
class AlunoNota{
    String aluno;
    Double nota;

    AlunoNota(String aluno, Double nota){
        this.aluno = aluno;
        this.nota = nota;
    }
}
public class Aluno {
    public static void main(String[] args) {
        // exercício 11 e 13
        Scanner sc = new Scanner(System.in);
        ArrayList<AlunoNota> alunos = new ArrayList<>();
        
        while (true) { 
        
   
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Remover aluno");
        System.out.println("4 - Informações notas");
        System.out.println("5 - Sair");
        int opcao = sc.nextInt();
        sc.nextLine();

        if(opcao == 1){
            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();

            System.out.println("Digite a nota do aluno: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            AlunoNota novoAluno = new AlunoNota(nome,nota);
            alunos.add(novoAluno);
            
            System.out.println("Aluno adicionado.");
        }
        else if(opcao == 2){
            System.out.println("Essa é a lista dos alunos");

            for (AlunoNota a : alunos) {
            System.out.println(a.aluno + " - " + a.nota);
            }
        }
        else if(opcao == 3){
            System.out.println("Digite o nome do aluno para remover:");
            String remove = sc.nextLine();

        for (int i = 0; i < alunos.size(); i++) {

            if (alunos.get(i).aluno.equalsIgnoreCase(remove)) {

            alunos.remove(i);
            System.out.println("Aluno removido.");
            break;
            }
        }
        } else if(opcao == 4){
            if(alunos.isEmpty()){
                System.out.println("Nenhum aluno cadastrado.");
                continue;
            }
            
            double soma = 0;
            double maior = alunos.get(0).nota;
            double menor = alunos.get(0).nota;
            for(AlunoNota a : alunos){
                    soma += a.nota;

            if(a.nota > maior){
                maior = a.nota;
            }
            if(a.nota < menor) {
                menor = a.nota;
            }   
            
        }
        double media = soma / alunos.size();
            System.out.println("Média: " + media);
            System.out.println("Maior nota: " + maior);
            System.out.println("Menor nota: " + menor);
    }
            else if(opcao == 5){
            System.out.println("Programa finalizado.");
            break;
        } else{
            System.out.println("Opção Inválida!");
        }
        }
    }
}
