import java.util.*;

public class Catalogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(new Locale("pt", "BR"));

        // Catálogo inicial
        Map<String, Double> catalogo = new LinkedHashMap<>(); // mantém ordem de inserção
        catalogo.put("Arroz", 5.00);
        catalogo.put("Feijão", 7.00);
        catalogo.put("Cerveja", 4.50);

        boolean rodando = true;

        while (rodando) {
            System.out.println("\nDigite o nome do produto (ou 'sair' para encerrar):");
            String produto = scanner.nextLine();

            if (produto.equalsIgnoreCase("sair")) {
                rodando = false;
                break;
            }

            // Produto já existe
            if (catalogo.containsKey(produto)) {
                System.out.println("Produto existente no catálogo.");
                System.out.println("Deseja alterar o preço? (sim/não)");
                String alterar = scanner.nextLine();

                if (alterar.equalsIgnoreCase("sim")) {
                    try {
                        System.out.println("Digite o novo preço:");
                        double preco = Double.parseDouble(scanner.nextLine().replace(",", "."));
                        catalogo.put(produto, preco);
                        System.out.printf("Preço atualizado: %s = R$ %.2f%n", produto, preco);
                    } catch (NumberFormatException e) {
                        System.out.println("Preço inválido!");
                    }
                } else {
                    System.out.println("Ok, sem alterações.");
                }

            } else { // Produto não existe
                System.out.println("Esse produto não está no catálogo...");
                System.out.println("Quer adicionar ao catálogo? (sim/não)");
                String respostaAdd = scanner.nextLine();

                if (respostaAdd.equalsIgnoreCase("sim")) {
                    try {
                        System.out.println("Qual o preço do produto?");
                        double preco = Double.parseDouble(scanner.nextLine().replace(",", "."));
                        catalogo.put(produto, preco);
                        System.out.printf("Produto %s adicionado com preço R$ %.2f%n", produto, preco);
                    } catch (NumberFormatException e) {
                        System.out.println("Preço inválido!");
                    }
                } else {
                    System.out.println("Beleza, não vou adicionar.");
                }
            }
        }

        // 🔥 Só imprime o catálogo completo no final
        System.out.println("\n📋 Catálogo Final:");
        for (Map.Entry<String, Double> entry : catalogo.entrySet()) {
            System.out.printf("- %s = R$ %.2f%n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nPrograma finalizado...");
        scanner.close();
    }
}

