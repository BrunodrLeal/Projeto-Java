import java.util.Scanner;

public class ExerSwitch {
    public static void main(String[] args) throws InterruptedException {// o throws InterruptedException  é usado para deixar 2 segundos o print antes de enviar ao usuário
        int lanche1 = 2490;


    Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, seja bem vindo ao BrunusBurger. o famoso 'Almoça comigo BB' ");
            Thread.sleep(2000); // espera 2 segundos

        System.out.println("Para começar qual o seu nome?");
            String nome = scanner.nextLine(); // informação sobre o nome do usuário.
            Thread.sleep(2000); // espera 2 segundos

        System.out.printf("ola %s, esse é os lanches disponíveis hoje no cardápio, %n pode escolher.", nome);
            Thread.sleep(2000); // espera 2 segundos

        System.out.println("X-Burger R$ 24,90");
        System.out.println("X-Salada R$ 27,90");
        System.out.println("X-Bacon R$ 32,90");
        System.out.println("X-Tudo R$ 45,90");
            String pedido =  scanner.nextLine();
             Thread.sleep(2000); // espera 2 segundos
        
        switch (pedido) {
            case "X-Burger":
            System.out.println("Ótimo pedido. deseja algum acompanhamento?(sim/nao)");
                Thread.sleep(2000); // espera 2 segundos
                String acompanhamento = scanner.nextLine();
                    if (acompanhamento == "sim")
                            
                            Thread.sleep(1000); // espera 1 segundos
                            
                        System.out.println("OK segue os acompanhamentos disponíveis...");
                            Thread.sleep(1000); // espera 1 segundos
                        System.out.println("Maionese Caseira R$ 2,90");
                        System.out.println("Batata Frita R$ 6,50");
                            String acressimo = scanner.nextLine();
                             Thread.sleep(2000); // espera 2 segundos

                        System.out.printf("Ok %s, acrecentado ao pedido do %s, com" + acressimo + "." + "%n Alguma bebida? %n Refrigerante R$ 8,00 %n Suco natural R$ 5,00",nome, pedido);
                            String bebida = scanner.nextLine();
                             Thread.sleep(2000); // espera 2 segundos
                        
                        System.out.printf("Finalizando seu pedido, você escolheu %s, %s, %s, Parabéns, foi uma excelente combinação!!! %n Deseja uma sobremesa? %n Temos Milkshake e Sorvete no copo.%n Milkshake(1) %n Sorvete no copo(2)",pedido, acressimo, bebida);
                            String sobremesa = scanner.nextLine();
                        System.out.println("Ótimo pedido");
                         Thread.sleep(1000); // espera 1 segundos
                        System.out.println("Agora só temos que realizar o pagamento...");
                        System.out.println("Sua conta ficou em,");

                        // fazer um switch para cada item . assim pode ser somado tudo no fim. 


                

                            


                          
            break;
        }


    }
}
