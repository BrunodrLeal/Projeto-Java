// 1 - Pedir peso em Kg
// 2 - Pedir altura em M.
// 3 - Calcular IMC => peso / (altura * altura)
// 4 - Exibir classificação
// <18.5 => Abaixo do pesol
// >= 18.5 e <= 24.9 => peso normal
// >= 25 e <29.9 => Sobrpeso
// Mais que isso: Obsedidade
import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Qual o seu nome? ");
                String nome = scanner.nextLine();
            
            System.out.println("Qual seu peso? ");
                double peso = scanner.nextDouble();

            System.out.println("Qual sua altura? ");
                double altura = scanner.nextDouble();

                double imc = peso / ( altura * altura);
                
            if (imc < 18.5) {
                System.out.printf( "%s, seu imc é %.2f%n e você está abaixo do peso.", nome, imc);
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.printf( "%s, seu imc é %.2f%n e você está com peso normal. #parabéns.", nome, imc);
            } else if (imc >=25 && imc < 29.9) {
                System.out.printf( "%s, seu imc é %.2f%n e você está acima de sobrepeso", nome, imc);
            } else {    
                System.out.printf( "%s, seu imc é %.2f%n e você está com Obesidade", nome, imc);
            }
            scanner.close();
    }
    
}

