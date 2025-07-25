package sessao8;
/* OQUE É UMA FUNÇÃO?
        * um bloco de código que realiza uma tarefa específica e pode e chamado para ser executada;
        * Divideo cóigo em partes menores, tornando-o mais organizao e fácil de manter;
        * Permite reutilizar código em diferentes partes do programa sem precisar reescrever a mesmas intruções;
        * Parâmentros e Retorno: Pode receber dados de entrada (parâmetros) e retornar um resultado após a execução;
        * As variaáveis declaradas dentro de uma função são locais e não afetam o retante do programa;
 */
 
/* CRIANDO A PRIMENRA FUNÇÃO
        * Normalmente uma função em java é definida com um tipo de retorno, um nome e pode ou não receber parâmetros;
        * A função pode ser criada sem parâmentros e sem retorno, ideal para tarefas simples que não requerem entrada ou saída;
        * Sitaxe básica: Consiste em um cabeçalho que incui o tipo de retorno (Void para sem retorno) e o corpo da função, onde o código é executado;
        * Chamando a função: A função é invocada pelo seu nome, e o código dentro dela é executado sempre que chamada;
        */

/* DIFERENÇA ENTRE A FUNÇÃO MAIN E OUTRAS FUNÇÕES
  * {FUNÇÃO MAIN}
        * É o ponto de entrada do programa, onde a execução começa;
        * Deve ter a assinatura exata public static void main(String[]args);
        * Todo Programa java precisa de uma Função main para ser execuitado;
  *  {OUTRAS FUNÇÕES}
        * Criadas para dividir o código em partes menores e gerenciáveis;
        * Podem ter diferentes tipos de retorno, nomes, e receber parâmetros;
        * Podem ser chamadas várias vezes em diferentes partes do programa;
        * São executadas apenas quando chamadas pelo código, ao contrário do main, que é eecutado automáticamente;
 */
/* ARGUMENTOS EM FUNÇÕES 
        * Dados que você passa para uma função ao chamá-la, permitindo que a função processe informações específicas;
        * Parâmentos são variáveis definidas na assinatura da função para receber os argumentos;
        * Funções podem receber nenhum, um ou vários argumentos, dependendo da tarefa que realizam;
        * Argumentos tonam as funções mais flexiveis e retilizavéis em diferentes contextos com dados diferentes;
        * Tipos de Argumentos: Podem ser de qualquer tipo primitivo (int,double,ETC.) ou Objetos;
*/

/* USO DO RETURN EM FUNÇÕES
        * Uma instrução que finlaiza a execução de uma função e opcionalmente, devolve um valor ao ponto onde a função foi chamada;
        * Finalização de função: quando o return é executado, a função para de executar, e o controle é devolvido ao chamador;
        * Tipo de Retorno: o return pode retornar valores de qualquer tipo, incluindo tipos primitivos, objetos, ou nenhum valor(void);
        * O returno permite que funções realizem cálculos ou operações e enviem o resultao de volta para ser utilizado em outras partes do programa; 
*/
/* FUNÇÃO COM X SEM RETORNO.
        * Fonções com retorno:
        * 1 - Permitem que uma oepração seja realizada e seu resultado seja utilizado em outras partes do programa;
        * 2 -  Cálculos, validções, e operações que produzem um resultado necessário para outras funções ou partes do código;
        * 3 -  Exemplo: Calcular a soma de dois números e retonar o resultado para ser exibido ou usado em outro cálculo;
/* FUNÇÃO SEM RETORNO
        * 1 - Executam uma ação sem precisar devolver um resultado, ideal para tarefas como exibição de dados ou alterações diretas no estado do programa;
        * 2 - Exibir mensagens: Modificar váriave globais, ou realizar operações que não requerem um retorno;
        * 3 -  Exemplo: Exibir uma mensagem de boas vindas ou atualizar o valor de uma variável de controle;
*/
/*  ENCAPSULAMENTO RETORNO EM VARIÁVEL  
        * O processo de armazenar o resultado de uma função em uma variável para uso posterior;
        * Permite reutilizar o valor retornado por uma função em várias partes do código, aumentando a modularidade e a legibilidade;
        * Uso Comum: Armazenar resultados de cálculos, verificações  ou operações complexas para evitar á mensma função;
        * Encapsular o retorno em uma variável pode ajudar a simplificar o código e reduzir a necessidade de executar novamente a função;
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
        int numero = 15;
        int numeroDobrado = dobrar(numero); // chamando a função dobrar com o número 10
            System.out.println("O número " + numero + " dobrado é: " + numeroDobrado);

        System.out.println(dobrar(12));
        // 4 - retorno da variável
        int numeroVerificar = 8;
        String r1 = verificarPar(numero);
        String r2 = verificarPar(3);
           
            System.out.println(r1);
                
            System.out.println(r2);
            
            int  x = dobrar (soma3(2,4));

            System.err.println(x);
        
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
        return n * 20;

    }
       public static String verificarPar (int n) { /* encapsulamento */
            if (n % 2 == 0 ) {
                return "o Numero " + n + " é par.";
            } else {
                return "O numero " + n + " é impar.";  
            }
    }
     public static int soma3 (int a , int b) { //Int a + int B são os argumentos
                return a + b;
       }   
       // Exemplos de encapsulamentos e retornos em variáveis
       public static int calcularQuadrado(int numero) {
            return numero * numero; // Retorna o quadrado do número
        }
        
        public static String formatarMensagem(String mensagem) {
            return "Mensagem: " + mensagem; // Retorna a mensagem formatada
        }          
           
   
        
    }
   