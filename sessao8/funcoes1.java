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

public class funcoes1 {
    public static void main(String[] args) {
        
        // primeiro exemplo de função]
        saudacao();
        saudacao();
        saudacao();
      
    }

    //Nivel de acesso, STATIC=> Não preciso instanciar classe para executar, void (tipo de retorno).
    // nome, os parenteses (AGS), Bloco {}

    public static void saudacao () {
        System.out.println("essa é minha primeira função.");

    }
        
    }
   