
import java.util.Scanner;


public class Exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        pegarNumeros(sc);
        Operador(sc);

        int num = pegarNumeros();
        int num1 = Operador(sc);

    }
    public static void pegarNumeros(Scanner sc) {

        System.out.println("Um número para a calculadora?");
        double n1 = sc.nextDouble();
        System.out.println("Outro número para a calculadora?");
        double n2 = sc.nextDouble();
        sc.nextLine();
    }
    public static void Operador(Scanner sc) {

        System.out.println("Escolha o operador... ");
        System.out.println(" Operador: + ,- ,* ,/");
        String operador = sc.nextLine();
        sc.nextLine();
    }
}
    




    


