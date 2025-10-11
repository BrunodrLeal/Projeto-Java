import java.util.Scanner;

    public class CalculadoraSimples {
    public static double Adicionar( double a, double b) {
        return a + b;
    }
    public static double Subtrair( double a, double b) {
        return a - b;
    }
    public static double Multiplicar( double a, double b) {
        return a * b;
    }
    public static double Divisao( double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        
        

        System.out.println("Um número para a calculadora?");
        double n1 = sc.nextDouble();

        System.out.println("Outro número para a calculadora?");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("(1) Adição (+)");
        System.out.println("(2) Subtração (-)");
        System.out.println("(3) Multiplicação (*)");
        System.out.println("(4) Divisão (/)");
        int operador = sc.nextInt();
        
        double  resultado = 0;
        
        switch (operador) {
            case 1:
                resultado = Adicionar(n1,n2);
                break;
            case 2:
                resultado = Subtrair(n1,n2);
                break;
            case 3:
                resultado = Multiplicar(n1,n2);
                break;
            case 4:
            if(n2 != 0) {
                resultado = Divisao(n1,n2);
            } else {
                System.out.println("Operação Inválida");
                sc.close();
                return;
            }
            break;
            default:
                System.out.println("Operação Inválida");
                sc.close();
                return;
        }
        System.out.println("O resultadoda operação é  "+ resultado);

        sc.close();
    }
}

        