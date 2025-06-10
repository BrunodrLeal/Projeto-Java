package secao2;

public class exercicio {
    public static void main(String[] args) {

    // 1 -oque são variáveis

    int valor = 10;
    int resultado = valor * 2;
    int valor2 = valor + 10;

    System.out.println("A primeira variável é " + valor + " O dobro do valor é: " + resultado);

     //seguno exercício
     //criar uma variavel char que armazene a letra "B" faça um casting explicito dessa variavel para int e eiba o valor númerico correspondente.
    char letra = 'B';
    int valorChar = (int) letra;
    System.out.println("O valor do char é: " + letra + " e seu valor numérico é: " + valorChar);

       //exercicio 3
    //Criar uma variavel double com 15.75 e 20.40. some os valores e forneça o resultado.

    double valor15 = 15.75;
    double valor20 = 20.40;

    double resultadoSoma = valor15 + valor20;
    System.out.println("A soma dos valores é: " + resultadoSoma);

    // ex4
        // declare uma lon d 2.000.000.000 e faça um casting para int. 

        
        long valorLong1 = 2_000_000_000L;
        int valorInt = (int) valorLong1;
        System.out.println( "O Valor Long é: " + valorLong1);

         //Concatenação de uma String de Olá Mundo em seja bem vindo ao Java!

        final String saudacao = "olá, Mundo!";
        String mensagem = saudacao + " Seja bem vindo ao Java!";
        System.out.println(mensagem); 
    }
}
