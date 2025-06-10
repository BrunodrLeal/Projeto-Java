import java.util.Scanner;

public class Exercicio {

// exercício 1
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println(" Digite um preço do produto: ");
    
    double preço = scanner.nextDouble();
    
    if (preço < 50 ) {
        System.out.println("O produto é barato");
    } 
    else if (preço >= 50 && preço <= 100) {
        System.out.println("o Valor está na média");

    } else if (preço > 101 && preço <= 150 ) {
        System.out.println("O produto é caro");
    }
    else if (preço > 150) {
        System.out.println("O produto é o mais caro");
    }
   
    // Fim do exercício 1
    
    // exercicio 2 
       
        
        System.out.println("digite seu usuário");
    String usuario = scanner.next();
        
        System.out.println("Digite sua senha");
    String senha = scanner.next();
      if (usuario.equals("admin") && senha.equals("1234")) { 
        System.out.println("Acesso Permitido");
      } else {
        System.out.println("acesso negado");
      }
    // Fim do exercício 2
    // exercicio 3
    
          System.out.println("digite um numero");
     double valor = scanner.nextDouble();
          if (valor % 2 == 0) {

           System.out.println("seu numero é par");
          }  else {
            System.out.println("Seu Número é Impar");
          }

        // exercicio 4case
        String dia = scanner.next(); 
        switch (dia) {

        case "1":
         System.out.print("final de semana, bom descanso!!! ");
         break;
        case "2":
         System.out.print("Hoje é dia Útil");
         break;
        case "3":
         System.out.print("Hoje é dia Útil");
         break;
        case "4":
         System.out.print("Hoje é dia Útil");
         break;
        case "5":
         System.out.print("Hoje é dia Útil");
         break;
        case "6":
         System.out.print("Hoje é dia Útil");
         break;
        case "7":
         System.out.print("final de semana, bom descanso!!! ");
         break;
        }
     scanner.close();

     }
}


