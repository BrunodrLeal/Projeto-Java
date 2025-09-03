    package sessao8;

    public class Exercícios {
        /* Exercício 1: 
            * Função para Converter Temperatura
            * Crie uma função que converta uma temperatura de Celcius para Fahrenheit.
            * a função deve receber a temperatura de Celcuis com Argumento e retornar o valor correspondente em Fahrenheit.
            * Exiba o resutlado encapsulado em uma Variável.
        */
        /* Exercício 2 : 
            *Função que calcule o fatorial de um número inteiro
            *teste a função com um número de sua escolha     
            */ 
        /* Exercício 3
            *Crie uma função que receba um número inteiro e retorne uma string indicando se o númro é "par" ou "impar". Us conicional if-else para determinar a paridade.  
            */    
        
    
        public static void main(String[] args) {
        // Exercício 1
            double celsius = 25.0;
            double fahrenheit = converterTemperatura(celsius);
            System.out.println("A temperatura de " + celsius + " C é equivalente a " + fahrenheit  +" fahrenheit. ");

            // Exercício 2
            System.out.println("Fatorial de 10 é: " + calcularFatorial(10));
            // Exercício 3

        System.err.println(verificarParidade(10));
        System.err.println(verificarParidade(101));
        }
        
        // função 1
        public static double converterTemperatura(double celsius) {
            return (celsius * 9/5) + 32;
        }

        // Função 2
        public static int calcularFatorial(int numero) {
            if (numero == 0 || numero == 1) {
                return 1;
            }  else {
                return numero * calcularFatorial(numero -1 );
            }
        }

        // Função 3
        public static String verificarParidade(int x) {
            if (x % 2 == 0) {
                return (" O número " + x + " é Par.");
            } else {
                return (" O número " + x + " é Impar." );
            }
        }
    }




            




