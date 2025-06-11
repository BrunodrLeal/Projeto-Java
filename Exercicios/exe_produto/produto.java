package Exercicios.exe_produto;
/* Ter Três produtos no catalogo.
             * Pedir nome do produto Ok
             * Verificar se temos o produto ok
             * se sim, quer alterar o preço ok
             * se não encerrar programa.
             * Exibir Classificação
             * Classificação preço < 50 = Barato , 50 a 100 = moderado, maior que 100 caro. 
             * Exibir no fim, nome do produto e Preço
             */

import java.util.Scanner;

public class produto {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

            
           
        String produto1 = "Teclado";
        String produto2 = "Mouse";
        String produto3 = "Monitor";

         double preco = 0;
            
        System.out.println("escreva o nome de um produto ? ");
        String nomeProduto = scanner.nextLine();

        if (produto1.equalsIgnoreCase(nomeProduto) || 
            produto2.equalsIgnoreCase(nomeProduto) || 
            produto3.equalsIgnoreCase(nomeProduto)) {

            System.out.println("Produto já existe. Quer atualizar o preço? (sim/não)");

            String resposta = scanner.nextLine();
                     
                 if(resposta.equalsIgnoreCase("sim")) {

                System.out.println("Insira o novo preço: ");
                preco = scanner.nextDouble();

            } else {

                System.out.println("Preço não atualizado!");
                scanner.close();
                return;

            }

        } else {

            System.out.println("Insira o preço do produto: ");
            preco = scanner.nextDouble();

        }

        // Classificação do preço
        if(preco < 50) {
            System.out.println("Classificação: barato");
        } else if(preco >= 50 && preco <= 100) {
            System.out.println("Classificação: moderado");
        } else {
            System.out.println("Classificação: Caro");
        }

        System.out.println("Produto: " + nomeProduto + ". Preço: " + preco);

        scanner.close();

    }
    
}