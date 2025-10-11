import java.util.*;
public class exe2 {


    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double celcius = 40;
    double fahrenheit = temperatura(celcius);
    System.out.println("a temperatura de" + celcius + " é equivalente a " + fahrenheit + "F");

    System.out.println("digite um número");
    int factorial = scanner.nextInt();
    System.out.println(getFactorialIterative(factorial));

    System.out.println("Digite um número para verificar se é par ou impar");
    int p = scanner.nextInt();
    ehPar(p);

    System.out.println(notaClasse(11));
    System.out.println(notaClasse(10));
    System.out.println(notaClasse(9));
    System.out.println(notaClasse(8));
    System.out.println(notaClasse(7));
    System.out.println(notaClasse(6));
    System.out.println(notaClasse(5));
    System.out.println(notaClasse(4));

   idadePessoa(12);
   idadePessoa(15);
   idadePessoa(16);
   idadePessoa(22);



    }

    public static Double temperatura(double celcius){
        return (celcius * 1.8) +32;
    
    }
    public static int getFactorialIterative(int n) {
    int factorial = 1; // O fatorial de 0 é 1, e 1 não afeta o produto
    for (int i = 1; i <= n; i++) {
        factorial = factorial * i; // Multiplica o fatorial atual por i
    }
    return factorial;
    }

    public static int ehPar (int p) {
    
    if (p % 2 == 0) {
        System.out.println("Esse numero " + p + " é par");
        return 1; // 1 for even
    } else {
        System.out.println("É impar");
        return 0; // 0 for odd
    }
    }
   public static String notaClasse (int nota) {
        if (nota < 0 || nota > 10) {
            return "Nota inválida";
        }

        switch (nota) {
                case 10:
                case 9:
                    return "A";
                case 8:
                    return "B";
                case 7:
                    return "C";
                case 6:
                    return "D";
                default:
                    return "F";
            }
        }
        public static String idadePessoa(int idade) {
         if (idade > 18) {
            return "Acesso permitido";
         }
            System.out.println("Acesso negado");
            System.exit(0);
            return "Acesso negado"; // Added to satisfy return requirement
        }
    }
    






