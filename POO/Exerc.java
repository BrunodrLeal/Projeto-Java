package POO;
import java.util.*;

public class Exerc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoPrat prato = new ProdutoPrat();
        
    // pedir ao usuário o nome do produto;
        
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();    
        prato.setNome(nome);

    // pedir ao usuário o valor do produto;
        System.out.println("Digite o valor do produto:");
        double preco = sc.nextDouble();
        sc.nextLine();
        prato.setPreco(preco);
    
    // pedir ao usuário a quantidade do produto;
        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        sc.nextLine();
        prato.setQuantidade(quantidade);

    // print das informações;
        System.out.println(prato.ExibirInfo());

    }
}
