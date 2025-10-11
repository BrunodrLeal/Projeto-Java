import java.util.Scanner;

public class Calcimc {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual o seu peso em Kg?");
            Double peso = scanner.nextDouble();

        System.out.println("Qual a sua altura?");
            Double altura = scanner.nextDouble();

        Double imc = peso / (altura* altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do Peso");
            System.out.printf("Seu %.2f%n esta em e você esta com  ",imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu %.2f%n esta em e você esta com  ",imc);
            System.out.println("Peso Normal");
        } else if (imc >= 25 && imc < 29.9 ) {
            System.out.printf("Seu %.2f%n esta em e você esta com ",imc);
            System.out.println("Sobrepeso");
        } else {
            System.out.printf("Seu %.2f%n esta em e você esta com " ,imc);
            System.out.println("Obesidade");
        }
    scanner.close();

}
}