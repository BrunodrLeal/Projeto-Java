package pratica1;
import java.util.*;

import secao2.scanner;
public class Biblioteca {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<String> livro = new ArrayList<>();
    ArrayList<String> autor = new ArrayList<>();

        while (true) {
            System.out.println("1 - Cdastrar Livro");//pronto
            System.out.println("2 - Listar livros");
            System.out.println("3 - Procurar Livro");
            System.out.println("4 - Remover Livro");
            System.out.println("5 - Emprestar Livro");
            System.out.println("6 - Devolver Livro");
            System.out.println("7 - Sair");
            int escolha = sc.nextInt();
        
            switch (escolha) {
                case 1:
                    Cadastrar(sc);
                
                break;
                case 2:
                    System.out.println("oi");
                
                break;
                case 3:
                    System.out.println("oi");
                
                break;
                case 4:
                    System.out.println("oi");
                
                break;
                case 5:
                    System.out.println("oi");
                
                break;
                case 6:
                    System.out.println("oi");
                
                break;
                case 7:
                    System.out.println("oi");
                
                break;
                
    
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    public static void Cadastrar(Scanner sc, ArrayList<String> livro, ArrayList<String> autor){
        // cadastramento
        System.out.println("Digite o nome do livro");
        String livroDigitado = sc.nextLine();
        livro.add(livroDigitado);
        System.out.println("Livro cadastrado.");

        System.out.println("Digite o nome do autor:");
        String autorDigitado = sc.nextLine();
        autor.add(autorDigitado);
        System.out.println("Autor cadastrado cadastrado.");
    }
    public static void Listar(Scanner sc, ArrayList<String> livro, ArrayList<String> autor){
        
        System.out.println("Livros Cadastrados.");
        for(String l : livro){
            int posicao = livro.indexOf(l);
            System.out.println(livro.get(posicao)+autor.get(posicao));
        }
        
    }

}

