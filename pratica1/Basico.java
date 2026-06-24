

import java.util.*;

public class Basico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Dados(sc);
        //doisNumeros(sc);
        //Nota(sc);
        //Laço(sc);
        //Tabuada(sc);
            //System.out.println("Digite um numero: ");
            //int numero = sc.nextInt();  

           // int resultado = fatorial(numero);
           // System.out.print(resultado);
        //numeroZero(sc);   
        //array10(sc);
        //cincoNomes(sc);
        //paresImpares(sc);
        sc.close();
}
    
    public static void Dados(Scanner sc){
       // Exercício 1 Variaveis, Scanner e if.
        System.out.println("Qual o seu nome?");
            String texto = sc.nextLine();

        System.out.println("Qual sua idade? ");
            int idade = sc.nextInt();
            sc.nextLine();
        
        if(idade < 18){
            System.out.println("Nome: " + texto + ". Idade: "+ idade + " = Menor de idade.");
        }else{
            System.out.println("Nome: " + texto + ". Idade: "+ idade + " = Maioridade.");
        }

        sc.close();
        }
    public static void doisNumeros(Scanner sc){
        // Exercício 2
        System.out.println("Escreva um numero?");
        int numero1 = sc.nextInt();

        System.out.println("Escreva outro numero?");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao =(double) numero1 / numero2;
        System.out.println("soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão:" + divisao);
        sc.close();
    }
    public static void Nota(Scanner sc){
        // Exercício 3
        System.out.println("Uma nota de 0 a 100: ");
        int nota = sc.nextInt();
        sc.nextLine();

        if(nota >= 90){
            System.out.println("Nota: 'Excelente'.");
        } else if( nota >= 70){
            System.out.println("Nota: 'Bom'.");
        } else if(nota >= 60){
            System.out.println("Nota: 'Regular'.");
        } else {
            System.out.println("Reprovado");
        }
    }
    public static void Laço(Scanner sc){
        // Exercício 4
        int somaPares = 0;
        int somaImpares = 0;
        int numero3 = 0;

        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
        for( int i = 1; i <= 100; i += 2){
             somaPares += i;
        }
            System.out.println(somaPares);
        for(int i = 1;i <= 100; i++){

            if(i % 2 != 0) {
                somaImpares += i;
            }
        }    
        System.out.println(somaImpares);
        for(int i = 5;i <= 100; i += 5){
            numero3 +=i;
        }
        System.out.println(numero3);
            
    }
    public static void Tabuada(Scanner sc){
        // Exercício 5
    int tabuada = 10;
    int resultado= 0;

    System.out.println("Digite um numero: ");
    int numeroTabuada = sc.nextInt();
    for(int i = 1; i <= tabuada; i++){
        resultado= numeroTabuada * i;
    System.out.println(numeroTabuada + " * "+ i +" = "+ resultado);
    }
    
}
    public static int fatorial(int numero){ 
    // Exercício 6
    if(numero == 0 || numero == 1) {
        return 1;
    } else{
        return numero * fatorial(numero -1);
    }
    }
    public static void numeroZero (Scanner sc){
        // Exercício 7
        ArrayList<Integer> vezes = new ArrayList<>();
        int soma = 0;
        int contador = 0;
        
        while (true) { 
            System.out.println("Digite um número para sair do loop");

            int numero = sc.nextInt();
            
            if (numero > 0){

                vezes.add(numero);
                contador++;
            } else if(numero < 0){
                System.out.println("Numero não permitido");

            } else{
                System.out.println("Acertou");
                for(int vez : vezes){
                soma += vez;    
                }
            

                System.out.println("Quantidade de Números: " + contador);
                System.out.println("Soma = " + soma);

                break;
            }
        }
    }
    public static void array10(Scanner sc){
            // Exercício 8
        int[] numeros = {15, 3, 27, -2, 8, 99, 14, 0, 7, 42};
        int i = 0;
        int maiorValor = numeros[0];
        int menorValor = numeros[0];

          while (i < numeros.length) {
              
            if(numeros[i] > maiorValor ){
                maiorValor = numeros[i];
              } 
              if(numeros[i] < menorValor){
                menorValor = numeros[i];
              }
              i++;
          }

          System.out.println("O maior valor é : "+ maiorValor);
          System.out.println("O menor valor é : "+ menorValor);
    }
    public static void cincoNomes(Scanner sc){
        // Exercício 9
        String[] nomes = new String[5];
        int quant = 0;

        while (quant < 5) {
        
            System.out.println("Escreva um nome? ");
            nomes[quant] = sc.nextLine();
            quant++;
        }                
            System.out.println(Arrays.toString(nomes));
            
        }
    public static void paresImpares(Scanner sc){
         // Exercício 10
        int[] numeros = new int[10];
        int somaPares = 0;
        int somaImpares = 0;

            for(int i =0; i < numeros.length; i++){

            System.out.println("Escreva um numero? ");
            numeros[i] = sc.nextInt();
            
            if(numeros[i] % 2 ==0){
            somaPares++;
            }   
               else {
            somaImpares++;
            }  
        }   
        
        System.out.println("O valor dos pares é : "+ somaPares);
        System.out.println("O valor dos imapres é : "+ somaImpares);             
                 
        }

    }
    


            
        
            