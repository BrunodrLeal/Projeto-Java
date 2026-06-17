package pratica1;
import java.util.ArrayList;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();

        while (true) { 
            
        
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Listar alunos");
        System.out.println("3 - Remover aluno");
        System.out.println("4 - Sair");
        int opcao = sc.nextInt();
        sc.nextLine();

        if(opcao == 1){
            System.out.println("Digite o nome do aluno:");
            String nome = sc.nextLine();
            alunos.add(nome);
            System.out.println("Aluno adicionado.");
        }
        else if(opcao == 2){
            System.out.println("Essa é a lista dos alunos");
            System.out.println(alunos);
            
        }
        else if(opcao == 3){
            System.out.println("Digite o nome do aluno para remover:");
            String remove = sc.nextLine();
            alunos.remove(remove);
            System.out.println("Aluno removido.");
        }
        else if(opcao == 4){
            System.out.println("Programa finalizado.");
            break;
        } else{
            System.out.println("Opção Inválida!");
        }
        }
    }
}
