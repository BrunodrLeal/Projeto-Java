package secao8;

public class Exercíciosextra {

    /*
     * Crie uma função calcular() que recebe dois números
     * e um operador (+, -, *, /) e retorna o resultado.
     */

    public static double calcular(double a, double b, char operador) {

        if (operador == '+') {
            return a + b;

        } else if (operador == '-') {
            return a - b;

        } else if (operador == '*') {
            return a * b;

        } else if (operador == '/') {
            if (b == 0) {
                System.out.println("Erro: divisão por zero.");
                return 0;
            }
            return a / b;

        } else {
            System.out.println("Operador inválido.");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcular(10, 5, '+')); // 15
        System.out.println(calcular(10, 5, '-')); // 5
        System.out.println(calcular(10, 5, '*')); // 50
        System.out.println(calcular(10, 5, '/')); // 2
    }
}