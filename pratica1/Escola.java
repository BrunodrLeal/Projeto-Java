package pratica1;
import java.util.*;
class Aluno{
    String nome;
    int idade;
    double nota1;
    double nota2;

    void Listar(){
        System.out.println("Lista:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
    }
    void Buscar(){
        
    }

    }
public class Escola {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int condicao = 1;
        
        ArrayList<Aluno> aluno = new ArrayList<>();
        
        Aluno novoAluno = cadastrarAluno(sc);
        alunos.add(novoAluno);

        while (condicao < 2) {
            System.out.println(" === Sistema Escolar JAVA === ");
            System.out.println("                              ");
            System.out.println("1 - Cadastrar aluno: ");
            System.out.println("2 - Listar alunos: ");
            System.out.println("3 - Buscar aluno: ");
            System.out.println("4 - Expulsar aluno: ");
            System.out.println("5 - Mostrar Estatísticas: ");
            System.out.println("6 - cadastrar aluno:");
            System.out.println("7 - sair:");

            int opcao = sc.nextInt();
            sc.nextLine();
            
            if (opcao == 1){
                cadastrarAluno(sc);
            }else if(opcao == 2) {
                listarAluno();
            }else if(opcao == 3) {

            }else if(opcao == 4) {

            }else if(opcao == 5) {

            }else if(opcao == 6) {

            }else if(opcao == 7){
                System.out.println("programa Finalizado");
                condicao = 3;
            }
        }
        
    }
    public static void cadastrarAluno(Scanner sc){
        System.out.println("Nome:");
        String nome = sc.nextLine();

        System.out.println("Idade:");
        int idade = sc.nextInt();

        System.out.println("Nota 1:");
        double nota1 = sc.nextDouble();

        System.out.println("Nota 2:");
        double nota2 = sc.nextDouble();
        sc.nextLine();
        
    }
    
    public static void listarAluno(){

    }
    public static void buscarAluno(){

    }
    public static void removerAluno(){

    }
    public static double calcularMedia(double n1, double n2){

    }
    public static void mostrarEstatisticas(){

    }
}
