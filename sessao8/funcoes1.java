package sessao8;

/* um bloco de código que realiza uma tarefa específica e pode ser chamado para ser executada;
 * Divide o cóigo em partes menores, tornando-o mais organizado e fácil de manter;
 * permite reutilizar em diferentes partes do programa sem prcisar rescrever as mesmas instruções; (boa prática de programação);
 * parâmetros e retorno: pode receber dados de entrada(parâmetos) e retornar um resultado após a execução;
 * As variáveis declaradas dentro de uma função são locais e não afetam o restante do programa;
 */
/* Criando a primeira função
 * Normalmente uma finção em java é definida com um tipo de retorno, um nome e pode ou não receber parâmetros;
 * a função pode ser cirada sem parâmentros e sem retorno, idela para tarefas simples que não requerem entra ou saída;
 * Sitaze básica: consiste em um cabeçalho que incui o tipo de retorno(Void para sem retorno)  eo corpo da fuinção, onde o código é executado;
 * chamando a função: a função é invocada pelo nome, e o código dentro dela é executado sempre que chamada;
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
        saudacao();
        saudacao();
        saudacao();
       
         // 2 - parâmetros
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
        System.out.println("Ola," + nome + ", Tudo bem? ");

    }
      public static int dobrar (int n) {
        return n * 5;

    }
    
   
        
    }
   