package sessao8;

/* Oque é uma função?
 * um bloco de código que realiza uma tarefa específica e pode e chamado para ser executada;
 * Divideo cóigo em partes menores, tornando-o mais organizao e fácil de manter;
 * Permite reutilizar código em diferentes partes do programa sem precisar reescrever a mesmas intruções;
 * Parâmentros e Retorno: Pode receber dados de entrada (parâmetros) e retornar um resultado após a execução;
 * As variaáveis declaradas dentro de uma função são locais e não afetam o retante do programa;
 */
 
/* Criando a primeira função
 * Normalmente uma função em java é definida com um tipo de retorno, um nome e pode ou não receber parâmetros;
 * A função pode ser criada sem parâmentros e sem retorno, ideal para tarefas simples que não requerem entrada ou saída;
 * Sitaxe básica: Consiste em um cabeçalho que incui o tipo de retorno (Void para sem retorno) e o corpo da função, onde o código é executado;
 * Chamando a função: A função é invocada pelo seu nome, e o código dentro dela é executado sempre que chamada;
 */
/*
 * Uso do return em Funções
 * Uma instrução que finlaiza a execução de uma função e opcionalmente, devolve um valor ao ponto onde a função foi chamada;
 * Finalização de função: quando o return é executado, a função para de executar, e o controle é devolvio ao chamador;
 * Tipo de Retorno: o return pode retornar valores de qualquer tipo, incluindo tipos primitivos, objetivos, ou nengum valor(void);
 * O returno permite que funções realizem cálculos ou operações e enviem o resultao de volta para ser utilizado em outras partes do programa;
 * 
 */
public class funcoes1 {
    public static void main(String[] args) {
        
        // primeiro exemplo de função]
        /* Tanto função como variáveis, a gente nomeia */
        saudacao(); /* é assim que se chama a função a ser executada. */
        saudacao();
        saudacao();

         /*Nivel de acesso, stativ => não preciso intanciar classe para executar, void é o tipo de retorno */        
         // 2 - parâmetros Sistaxe: Nome, os parenteses ( ARGUMENTOS), BOLOCO {}
        soma(2, 4); /* usando função da pra fazer várias somas ou qualquer outra coisa deixando o código mais limpo e organizado.  */
        soma(5, 4);
        soma(12, 4);
        soma(158, 4);
        soma(3 , 5);
        soma(10, 20);  
        saudar("Bruno Leal");
        dobrar(4);
        int numero = 10;
        int numeroDobrado = dobrar(numero); // chamando a função dobrar com o número 10
        System.out.println("O número " + numero + " dobrado é: " + numeroDobrado);

        System.out.println(dobrar(12));
        // 4 - retorno da variável
        int numeroVerificar = 8;
        String r1 = verificarPar(numero);
        String r2 = verificarPar(3);
            System.out.println(r1);
            System.out.println(r2);
        
    }

    //Nivel de acesso, STATIC=> Não preciso instanciar classe para executar, void (tipo de retorno).
    // nome, os parenteses (AGS), Bloco {}

    

    public static void saudacao () {
        System.out.println("essa é minha primeira função.");

    }

    public static void soma(int a , int b) { //Int a + int B são os argumentos
        int resultado = a + b; // função
        System.out.println("O resultado da soma é: " + resultado ); 

    }
      public static void saudar (String nome) {
        System.out.println("Ola, " + nome + ", Tudo bem ? ");

    }
      public static int dobrar (int n) {
        return n * 5;

    }
        /* Funções com X sem retorno.
        * Fonções com retorno:
        * 1 - Permitem que uma oepração seja realizada e seu resultado seja utilizado em outras partes do programa;
        * 2 -  Cálculos, validções, e operações que produzem um resultado necessário para outras funções ou partes do código;
        * 3 -  Exemplo: Calcular a soma de ddois números e retonar o resultado para ser exibido ou usado em outo cálculo;
        */
        /* Funções sem rotorno
        * 1 - Executam uma ação sem precisar devolver um resultado, idela para tarefas como exibição de dados ou alterações iretas no estado do programa;
        * 2 - Exibir mensagens, Modificar váriave globais, ou realizar operações que não requerem um retorno
        * 3 -  Exemplo: exibir uma mensagem de boas vindas ou atualizar o valor de uma variável de controle;
        */

      /*  ENCAPSULAMENTO RETORNO EM VARIÁVEL  
        * O processo de armazenar o resultado de uma função em uma variável para uso posterior;
        * Permite reutilizar o valor retornado por uma função em várias partes do código, aumentando a modularidade e a legibilidade;
        * Uso Comun: Armazenar resultados de cálculos, verificações  ou operações complexas para evitar á mensa função;
        * Encapsular o retorno em uma variável pode ajudar a Simplificar o cóigo e reduzir a necessidade de executar novamente a função;
      */

       public static String verificarPar (int n) {
            if (n % 2 == 0 ) {
                return "o Numero " + n + " é par.";
            } else {
                return "O numero " + n + " é impar.";  
            }
       }   
       // Exemplos de encapsulamentos e retornos em variáveis
       public static int calcularQuadrado(int numero) {
            return numero * numero; // Retorna o quadrado do número
        }
        
        public static String formatarMensagem(String mensagem) {
            return "Mensagem: " + mensagem; // Retorna a mensagem formatada
        }          
           
   
        
    }
   