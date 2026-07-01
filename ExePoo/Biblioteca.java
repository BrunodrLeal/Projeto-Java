package ExePoo;
import java.util.*;

public class Biblioteca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    // Exercício 5: Classe LivroBiblioteca com Lógica em Setters e Getters
/* 
    Crie uma classe LivroBiblioteca com as propriedades privadas titulo, autor, e disponivel (boolean). ok
    Adicione métodos para pegar emprestado (definindo disponivel como false) ok
    e devolver o livro (definindo disponivel como true). ok
    Nos setters e getters, adicione a lógica para verificar se o livro está disponível 
    ou já emprestado antes de permitir a ação. 
    Na classe principal, instancie dois livros e simule o processo de empréstimo e devolução.
    
*/  
    while (true) {
        LivroBiblioteca livro1 = new LivroBiblioteca();
    System.out.println("Deseja um livro (sim) / (não)");
    String opcao = sc.nextLine();
        if(opcao.equalsIgnoreCase("sim")){

            
                
            livro1.setDisponivel();
        } else {
           
            livro1.setOcupado();
        }
    }   
    }
}

