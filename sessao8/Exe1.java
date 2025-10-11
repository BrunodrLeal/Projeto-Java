import java.util.Scanner;

public class Exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quero um número");
        int numero1 = scanner.nextInt();

        System.out.println("Quero outro número");
        int numero2 = scanner.nextInt();

        somar(numero1, numero2);

        System.out.println("Quero o primeiro Número");
        int num1 = scanner.nextInt();
        System.out.println("Quero o segundo Número");
        int num2 = scanner.nextInt();
        int resul = num1 + num2;

        // chama ehPar e guarda o boolean
        boolean par = ehPar(resul);
        System.out.println("O número " + resul + " é par? " + par);

        scanner.close();
    }

    public static void somar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("A soma é: " + resultado);
    }

    // função retorna boolean
    public static boolean ehPar(int n) {
        return n % 2 == 0; // true se par, false se ímpar
    }
}

