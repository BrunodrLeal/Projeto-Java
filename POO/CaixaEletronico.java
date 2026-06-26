package POO;
import java.util.*;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancariaP> contas = new ArrayList<>();
        

        while (true) {
            System.out.println("1 - Cadastrar usuário.");
            System.out.println("2 - Saldo Bancário.");
            System.out.println("3 - Transferência");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: // coletar os dados do usuário;
                    ContaBancariaP cadastro = new ContaBancariaP();
                    System.out.println("Digite o nome do usuário: ");
                    String nome = sc.nextLine();
                    cadastro.setUsuario(nome);
                    cadastro.setConta();

                    System.out.println("Valor a ser depositado: ");
                    double saldo = sc.nextDouble();
                    sc.nextLine(); // limpa o enter;
                    cadastro.setSaldo(saldo);

                    contas.add(cadastro);
                    break;
            
                case 2: // Ver saldo bancário;
                    System.out.println("Buscar saldo por nome digete: (1), por conta digite: (2) ");
                    int pesquisa = sc.nextInt();
                    sc.nextLine();
                        if(pesquisa == 1){ // pesquisa por usuario;
                            System.out.println("Digite o usuário: ");
                            String pesquisaUsuario = sc.nextLine();
                            for(ContaBancariaP conta : contas){
                                if(conta.getUsuario().equalsIgnoreCase(pesquisaUsuario)){
                                    System.out.printf("Usuário: %s%n Saldo: R$ %.3f\n", conta.getUsuario(), conta.getSaldo());
                                   
                                }
                            }
                        } else if(pesquisa == 2) { // pesquisa por conta;
                            System.out.println("Digite a conta: ");
                            int pesquisaConta = sc.nextInt();
                            sc.nextLine();
                                for(ContaBancariaP conta : contas){
                                    if(conta.getConta() == pesquisaConta){
                                    System.out.printf("Usuário: %s%n Saldo: R$ %.3f%n", conta.getUsuario(), conta.getSaldo());
                                    }
                                }
                        } else {
                            System.out.println("Opção inválida, tente novamente.");
                        }
                    
                    break;
                
                case 3:
                    
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
