import java.util.Scanner;

public class ExerSwitch {
    public static void main(String[] args) throws InterruptedException {// o throws InterruptedException  é usado para deixar 2 segundos o print antes de enviar ao usuário
        Scanner scanner = new Scanner(System.in);
             boolean lancheValido = false;
             boolean rodando = true;
       while(rodando) {      
        while (lancheValido) { // enquanto o lanche for falso, ele repete o menu.
        double lanche = 0;
        double acrecimo = 0;
        double bebida = 0;
        double sobremesa = 0;
        double total = 0.0;
        String lach1 = "X-Burger";
        String lach2 = "X-Salada";
        String lach3 = "X-Bacon";
        String lach4 = "X-Tudo";
        String acrec1 = "Batata Frita";
        String acrec2 = "Onion Rings";
        String acrec3 = "Nuggets";
        String acrec4 = "Bacon Extra";
        String refri = "Refrigerante";
        String suco = "Suco Natural";
        String milk = "Milkshake";
        String sorv = "Sorvete no copo"; 
        
    
        System.out.println(" Olá, seja bem vindo ao BrunusBurger. o famoso 'Almoça comigo BB' ");
            Thread.sleep(1000); // espera 1 segundos

        System.out.println(" Para começar qual o seu nome?");
            String nome = scanner.nextLine(); // informação sobre o nome do usuário.
            Thread.sleep(1000); // espera 1 segundos

        System.out.printf(" Olá %s, esse é os lanches disponíveis hoje no cardápio! %n", nome);
            Thread.sleep(1000); // espera 1 segundos

        System.out.println(" X-Burger R$ 24,90");
        System.out.println(" X-Salada R$ 27,90");
        System.out.println(" X-Bacon R$ 32,90");
        System.out.println(" X-Tudo R$ 45,90");
            String pedido =  scanner.nextLine();
             Thread.sleep(1000); // espera 1 segundos
        
        switch (pedido.toLowerCase()) { // switch para os lanches.
            
            case "x-burger":
                System.out.printf(" %n . Ótimo pedido. %n Você escolheu o %s. %n",nome,lach1);
                lanche += 24.90;
                lancheValido = true; // só sai quando acerta
            break;
            case "x-salada":
                System.out.printf( " %n . Ótimo pedido. %n Você escolheu o %s. %n",nome,lach2);
                lanche += 27.90;
                lancheValido = true; // só sai quando acerta
            break;
            case "x-bacon":
                System.out.printf(" %n . Ótimo pedido. %n Você escolheu o %s. %n",nome,lach3);
                lanche += 32.90;
                lancheValido = true; // só sai quando acerta
            break;
            case "x-tudo":
                System.out.printf(" %n . Ótimo pedido. %n Você escolheu o %s. %n",nome,lach4);
                lanche += 45.90;
                lancheValido = true; // só sai quando acerta
            break;
            default:
            System.out.println("Opção invalida %n");
            break;
        } 
        System.out.println("  ");
        System.out.println("Valor do pedido R$ " + lanche);
        System.out.println("  ");
       
        Thread.sleep(1000); // espera 1 segundos
        System.out.println("Escolha seu Acrécimo...");
        Thread.sleep(1000); // espera 1 segundos
        System.out.println("  ");

                
        System.out.println(" Batata Frita R$ 9.90");
        System.out.println(" Onion Rings R$ 12.90");
        System.out.println(" Nuggets R$ 8.90");
        System.out.println(" Bacon extra R$ 3.99");
        String acrecimo1 = scanner.nextLine();
        System.out.println("  ");
        
        boolean acrecimoValido = false;
        while (acrecimoValido) {
            
        
        switch (acrecimo1.toLowerCase()) { // switch para os acrecimos.
            case "batata frita":
                System.out.printf("Ótimo pedido. %n Você escolheu o %s. Vamos para as bebidas.%n",acrec1);
                acrecimo += 9.90;
                acrecimoValido = true; // só sai quando acerta
            break;
            case "onion rings":
                System.out.printf("Ótimo pedido. %n Você escolheu o %s. Vamos para as bebidas.%n",acrec2);
                acrecimo += 12.90;
                acrecimoValido = true; // só sai quando acerta
            break;
            case "nuggets":
                System.out.printf("Ótimo pedido. %n Você escolheu o %s. Vamos para as bebidas.%n",acrec3);
                acrecimo += 8.90;
                acrecimoValido = true; // só sai quando acerta
            break;
            case "bacon extra":
                System.out.printf("Ótimo pedido. %n Você escolheu o %s. Vamos para as bebidas.%n",acrec4);
                acrecimo += 3.99;
                acrecimoValido = true; // só sai quando acerta
            break;
            default:
            System.out.println("Opção invalida.%n");
            break;
        } }
        
        double parcial1 = lanche + acrecimo;
        System.out.println("Valor do pedido mais o acrécimo R$ " + parcial1);
        System.out.println("  ");

        System.out.println(" Refrigerante R$ 12.99");
        System.out.println(" Suco Natural R$ 8.99");
        
        String bebida1 = scanner.nextLine();

        boolean bebidaValido = false;
        while (bebidaValido) {
            
        switch (bebida1.toLowerCase()) { // switch para as bebidas.
            case "refrigerante":
                System.out.printf(" Ótimo pedido. %n Você escolheu o %s. Sobremesa agora.%n",refri);
                bebida += 12.99;
                bebidaValido = true; // só sai quando acerta
            break;
            case "suco natural":
                System.out.printf(" Ótimo pedido. %n Você escolheu o %s. Sobremesa agora.%n",suco);
                bebida += 8.99;
                bebidaValido = true; // só sai quando acerta
            break;
          
            default:
            System.out.println(" Opção invalida.%n");
            
            break;
        }
    }
        double parcial2 = lanche + acrecimo+ bebida; 
        System.out.println("Valor do pedido, acrécimo mais a bebida R$ " + parcial2);
        System.out.println("  ");

        System.out.println(" Milkshake R$ 12.99");
        System.out.println(" Sorvete no Copo R$ 7.99");
        
        String sobremesa1 = scanner.nextLine();
        
        boolean sobremesaValido = false;
        while(sobremesaValido){
        switch (sobremesa1.toLowerCase()) { // switch para as sobremesas.
            case "milkshake":
                System.out.printf(" Ótimo pedido. %n Você escolheu o %s.%n Finalizado seu pedido.%n Obrigado pela preferência.%n",milk);
                sobremesa += 12.99;
                sobremesaValido = true; // só sai quando acerta
            break;
            case "sorvete no copo":
                System.out.printf(" Ótimo pedido. %n Você escolheu o %s.%n Finalizado seu pedido.%n Obrigado pela preferência.%n",sorv);
                sobremesa += 7.99;
                sobremesaValido = true; // só sai quando acerta
            break;
          
            default:
            System.out.println(" Opção invalida.%n");
            
            break;
            } 
        }
        System.out.println("  ");   
        // finalizando o programa

        double parcial3 = lanche + acrecimo + bebida + sobremesa; 
        System.out.println("Valor do pedido, acrécimo mais a bebida R$ " + parcial3);
        System.out.println("  ");

        System.out.println("Agora só precisa pagar, vou te enviar a sua conta.");
        Thread.sleep(1000); // espera 1 segundos
        System.out.println("  ");
        
        total = lanche + acrecimo + bebida + sobremesa;
        System.out.println("Valor total do seu pedido foi R$ " + total);
        
            rodando = false;   
    }
           }
        scanner.close();
    }
}