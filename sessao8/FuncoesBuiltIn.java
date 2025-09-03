package sessao8;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        //10- Exemplo de funções built-in em Java

         /* O que são Funções  Built-in em java?
       * São funções já icorporadas na linguagem Java que fornece funcionalidades comuns e essenciais. Elas são prontas para uo e não precisam ser definidas pelo programador;
       * Estão disponíveis automáticamente sem ncessidad de importação ou definição ;
       * para que servem: Manipulação de Strings, operações matemáticas, converão de dados, entre outras funcionalidades;
       * Geralmente, as Funções Built-in São altamente otimizadas para desempenho;
       */
      /* Funções Built-In de String
       * length():  Retrona o Comprimento de uma String, ou seja, o número de caracteres;
       * substring(int beginIndex, int endIndex): Extrai uma subseqência da string, começando do ìndice beginIndex e terminano em endIndex;
       * toUpperCase(): Converte todos os caracteres da string para letras maiúsculas;
       * replace(char oldChar, char newChar): Substitui toda as ocorrência de um caractere especificado por outro;
       * prática.
       */
        
        String frase = "Java é uma linguagem de programação poderosa.";

        //lebght
            System.out.println(frase.length());

        // int => inteiro
        // String => S => letra mauiscula inicial => classe
            System.out.println(frase.substring(0,19));

            System.out.println(frase.replace("a", "e"));
        String fraseModificada = frase.toUpperCase();
        System.out.println(fraseModificada.toLowerCase());

    /* Funções Built-in de Número (Math)
     * Math.sqrt(double a): Calcula a Raiz quadrada de um Número;
     * Math.pow(double a, double b): Eleva a um número à potência b;
     * Math.abs(int a): Retorna o valor absoluto de um número;
     * Math.max(int a, int b): Retorna o maior de dois números;
     * Vamos utilizá-las!
     */
    /* 11 Funções de math */
    System.out.println(Math.sqrt(26)); // Raiz quadrada de 25
    System.out.println(Math.sqrt(9)); // 9 elevado à potência 2
    System.err.println(Math.pow(2, 3)); // 2 elevado à potência 3
    System.out.println(Math.abs(-10)); // Valor absoluto de -10
    System.out.println(Math.max(10, 20));
    System.out.println(Math.max(100, 10)); // Retorna o maior entre 20 e 30 

    double raizQuadrada = Math.sqrt(99);
    System.out.println("Raiz quadrada de 99: " + raizQuadrada);


}
}
