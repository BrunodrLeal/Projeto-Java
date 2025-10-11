package secao14;


import java.util.ArrayList;
import java.util.Scanner;

public class BancoBruno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Deposito> Deposito = new ArrayList<>();

        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Banco Bruno ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Deposito");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = sc.nextLine();

                    System.out.print("Digite o email: ");
                    String email = sc.nextLine();

                    System.out.print("Digite a rua: ");
                    String rua = sc.nextLine();

                    System.out.print("Digite o numero da casaou apartamento: ");
                    int numeroCasa = sc.nextInt();
                    sc.nextLine(); // Consumir a quebra de linha

                    System.out.print("Digite o bairro: ");
                    String bairro = sc.nextLine();

                    System.out.print("Digite a cidade: ");
                    String cidade = sc.nextLine();

                    System.out.print("Digite o estado: ");
                    String estado = sc.nextLine();
                    
                    System.out.print("Saldo inicial: ");
                    Double saldo = sc.nextDouble();

                    int numeroConta = (int) (Math.random() * 90000 + 100000);

                    Cliente novoCliente = new Cliente(nome, telefone, email, rua, numeroCasa, bairro, cidade, estado, numeroConta,saldo);
                    clientes.add(novoCliente);

                    System.out.println("\n✅ Cliente cadastrado com sucesso!");
                    break;

                case "2":
                    if (clientes.isEmpty()) {
                        System.out.println("\nNenhum cliente cadastrado ainda.");
                    } else {
                        System.out.println("\n=== Lista de Clientes ===");
                        for (Cliente c : clientes) {
                            c.exibirInfo();
                        }
                    }
                    break;
                    case "3":
                    
                    System.out.println("Valor do Depósito? ");
                    double valor = sc.nextDouble();

                    System.out.println("Conta destino? ");
                    int contaDestino = sc.nextInt();
                    sc.nextLine();
                    for (Cliente c : clientes) {
                        if (c.getNumeroConta() == contaDestino) {
                        c.setSaldo(c.getSaldo() + valor);
                        break;
                    }
                    }
                
                    System.out.println("Data? ");
                    String data = sc.nextLine();

                    System.out.println("Hora? ");
                    String hora = sc.nextLine();

                    System.out.println("Descrição do deposito? ");
                    String descricao = sc.nextLine();

                    Deposito novoDeposito = new Deposito(valor, contaDestino, data, hora, descricao);
                    Deposito.add(novoDeposito);
                    
                    System.out.println("\n✅ Depósito realizado com sucesso!");
                    break;
                    
                case "4":
                    executando = false;
                    System.out.println("Saindo do Banco Bruno... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
