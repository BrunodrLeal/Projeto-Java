import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        preco(scanner);
        login(scanner);
        Impar(scanner);
        Dia(scanner);
        Intervalo(scanner);
        vogal(scanner);

        scanner.close();
    }

    public static void preco(Scanner scanner){
        
         System.out.println("Insira um preço de um produto");
         double prod1 = scanner.nextDouble();
         
         if(prod1 < 50) {
            System.out.println("Produto barato");
        
         } else if (prod1 >= 50 && prod1 <= 100) {
            System.out.println("Preço Médio");
         } else {
            System.out.println("produto com preço caro.");
         }

         

    }
    public static void login(Scanner scanner) {
        
        scanner.nextLine();

            System.out.println("Digite seu usuário");
            String login = scanner.nextLine();

            System.out.println("Digite sua senha");
            double senha = scanner.nextDouble();

        if(login.equalsIgnoreCase("admin")&& senha == 1234){
            System.out.println("Usuário correto");
        } else {
            System.out.println("usuário incorreto");
        }
        

    
    }  
    public static void Impar(Scanner scanner) {

         System.out.println("Me dê um número, qualquer número...");
         int numero = scanner.nextInt();

         if (numero % 2 == 1) {
            System.out.printf("O %d é impar",numero);
         } else {
            System.out.printf("Esse %d é Par", numero);
         }
         

         
}
   public static void Dia(Scanner scanner) {

    System.out.println("");

         System.out.println("Me dê um número de 1 a 7?");
         int dia = scanner.nextInt();
          if (dia == 2){
            System.out.println("Segunda-Feria, dia útil!!!");
          }else if (dia == 3) {
            System.out.println("Terça-Feira, dia útil!!!");
          } else if (dia == 4) {
            System.out.println("Quarta-Feira, dia útil!!!");
          } else if (dia == 5) {
            System.out.println("Quinta-Feira, dia útil!!!");
          } else if (dia == 6) {
            System.out.println("Sexta-Feira, dia útil!!!");
          } else if (dia == 7) {
            System.out.println("Sábado, dia de folga");
          } else if (dia == 1) {
            System.out.println("Domingo, dia de folga");
          } else {
            System.out.println("Número errado.");
          }
          switch (dia) {
              case 1:
                System.out.println("Domingo, dia de folga");
                  
              break;
                  case 2:
                  case 3:
                  case 4:
                  case 5:
                  case 6:
                  System.out.println("Dia util!!!");
                  
                  break;
                  case 7:
                  System.out.println("Sábado, dia de folga");
                  
                  break;
                  
                  default:
                  break;
          }
}
public static void Intervalo(Scanner scanner) {

    System.out.println("Insica um número");
    int numero2 = scanner.nextInt();
    if (numero2 >= 10 && numero2 <= 20) {
        System.out.println("Dentro do intervalo");
        
    } else {
        System.out.println(" fora do intervalo.");
    }
}

  public static void vogal(Scanner scanner) {
    
    scanner.nextLine();
      System.out.println("Me dê uma letra");
      char letra = scanner.next().toLowerCase().charAt(0);
    switch (letra) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        System.out.println("Essa letra é vogal");
            break;
        default:
        System.out.println("Essa é uma consoante");
            throw new AssertionError();
    }
    scanner.close();
}
}
