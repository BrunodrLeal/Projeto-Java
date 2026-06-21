package pratica1;
import java.util.*;

class Compra{
    public static void main(String[] args) {
        // Exercício 12
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produto = new ArrayList<>();
        
        System.out.println("Bem vindo ao sistema de compras");

        while (true) {
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Sair"); 
            int opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1){

                System.out.println("Qual o nome do produto:");
                String prod1 = sc.nextLine();
                produto.add(prod1);
                System.out.println("Cadastrado com sucesso!");   
            }
            else if(opcao == 2){

                System.out.println("Nome do produto para remover:");
                String remov = sc.nextLine();
                produto.remove(remov);

                System.out.println("Removido com sucesso!");
            } 
            else if(opcao == 3) {
                System.out.println("Nome do produto para pesquisa.");
                String pesquisa= sc.nextLine();
                
                if(produto.contains(pesquisa)){
                    System.out.println("produto encontrado!");
                }
                else{
                System.out.println("Produto não encontado.");
                }
            }
            else if (opcao == 4){
                System.out.println("Programa encerrado");
                break;
            }
            else{
                System.out.println("Opção Inválida!");
            }
        }
    }
}
