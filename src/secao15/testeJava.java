package secao15;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class testeJava {
    public static void main(String[] args) throws FileNotFoundException {

    int contador = 0;
    String opcao = "";
       Scanner sc = new Scanner(System.in);

       ArrayList<String> alunos = new ArrayList<>();
       File arquivo = new File("alunos.txt");
        
        if(arquivo.exists()){
           
            Scanner leitor = new Scanner(arquivo);

            while(leitor.hasNextLine()){
            alunos.add(leitor.nextLine());
            }
        }

       while (!opcao.equals("3")) {
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Retirar aluno");
            System.out.println("3 - Encerrar");
            
            opcao = sc.nextLine();
             if(opcao.equals("1")){
                System.out.println("nome do aluno");
                String nome = sc.nextLine();
                
                alunos.add(nome);
                contador++;
                System.out.println("Aluno cadastrado com sucesso!");

             } else if(opcao.equals("2")){
                
                System.out.println("Digite o nome do aluno que deseja remover:");
                String nomeRemover = sc.nextLine();

                    boolean removido = alunos.remove(nomeRemover);

                    if(removido){
                        System.out.println("aluno removido! ");
                        contador--;
                    }else{
                        System.out.println("aluno não encontrado! ");
                    }

             }else if(opcao.equals("3")){
                
                System.out.println("Cadastro encerrado!");
                break;
             }
       }

       while (true) {

       System.out.println("1 - Lista alunos: ");
       System.out.println("2 - Procurar aluno: ");
       System.out.println("3 - Encerrar: "); 
       String escolha = sc.nextLine();
            
            if( escolha.equals("1")){
                System.out.println(alunos);

            } else if( escolha.equals("2")){
                System.out.println("Digite o nome do aluno:");
                    String nomeBusca = sc.nextLine();

                    if(alunos.contains(nomeBusca)) {
                        System.out.println("Aluno encontrado!" + nomeBusca);
                    } else {
                        System.out.println("O Aluno" + nomeBusca + " não foi encontrado.");
                    }
            }else if(escolha.equals("3")){
                System.out.println("Total de alunos: " + contador);
                System.out.println("Primeiro aluno: " + alunos.get(0));
                System.out.println("Último aluno: " + alunos.get(alunos.size() - 1));
                break;
            }else{
                System.out.println("Opção inválida. ");
            }
        }
    }      
}
