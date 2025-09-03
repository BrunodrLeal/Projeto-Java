import java.util.Scanner;
import java.time.LocalTime;


public class estudosOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime agora =  LocalTime.now();
        int hora =  agora.getHour();
        int minuto = agora.getMinute();

        System.out.println(hora + ":" + minuto);
        
        if (hora >= 5 && hora < 12){
        System.out.println("Olá, Bom dia!");
        } else if ( hora >= 12 && hora < 18){
        System.out.println("Olá, boa tarde!");
        } else {
            System.out.println("Olá Boa noite...");
        }

        System.out.println("Qual o seu nome?");
            String nome =  scanner.nextLine();

        System.out.printf("Ola %s, quantos anos você tem? ", nome);
            int idade = scanner.nextInt();
                if (idade <= 15) {
                    System.out.println("Você não pode entrar...");
                } else if ( idade >=16) {
                    System.out.println("Você está habilitado, pode entrar.");
                }
 
    } 
    
}
