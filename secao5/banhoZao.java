package secao5;
import java.util.Scanner;

public class banhoZao {


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Olá, eu sou o Zão");
    System.out.println(" ");
    System.out.println("Primeiro me dia... tem café?");
    System.out.println("  ");
    String cafe = scanner.nextLine();
    System.out.println("  ");
    if(cafe.equalsIgnoreCase("sim")) {
        System.out.println("bora tomar café");
    
    } else if(cafe.equalsIgnoreCase("não")) {
        System.out.println("ok, sem café hoje");
    
    } else {
        System.out.println("responda apenas sim ou não");
    }
    System.out.println("olá você quer tomar banho com o Zão(Sim/Não)");
    String banho = scanner.nextLine();
    if(banho.equalsIgnoreCase("sim")) {
        System.out.println("bora fazer amor");
    
    } else if(banho.equalsIgnoreCase("Não")) {
        System.out.println("ok, sem banho hoje");
    
    } else {
        System.out.println("responda apenas sim ou não");
    }
 
        
    }
}
