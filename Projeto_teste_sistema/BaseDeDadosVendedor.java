import java.util.ArrayList;
import java.util.Scanner;

public class BaseDeDadosVendedor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> vendedores = new ArrayList<>();

        vendedores.add("Rodrigo");
        vendedores.add("Ana Beatriz");
        vendedores.add("Elen Souza");
        vendedores.add("Renata Bernardes");
        vendedores.add("Maria Clara");
        vendedores.add("Lavinea Cristina");
        vendedores.add("Bruno Leal");
        vendedores.add("Ana Luiza");

        System.out.println("\nLista de Vendedores:");
        for (int i = 0; i < vendedores.size(); i++) {
        System.out.println((i + 1) + " - " + vendedores.get(i));
  }
            System.out.print("\nDigite o número do vendedor responsável pela pré-venda: ");
        int escolha = sc.nextInt();
        String vendedorEscolhido = vendedores.get(escolha - 1);

        System.out.println("Vendedor escolhido: " + vendedorEscolhido);

        System.out.print("\nDeseja cadastrar um novo vendedor? (s/n): ");
        char opcao = sc.next().charAt(0);

        if (opcao == 's' || opcao == 'S') {
        System.out.print("Digite o nome do novo vendedor: ");
        sc.nextLine(); // limpar buffer
        String novoVendedor = sc.nextLine();
        vendedores.add(novoVendedor);
        System.out.println("Novo vendedor cadastrado com sucesso!");
}   
 }      

}