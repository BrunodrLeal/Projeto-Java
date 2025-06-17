


public class funcoesb{

public class FuncoesB {
  
    public static void main(String[] args) {
          
               /* FUNÇÔES COM IF?ELSE E CONICIONAIS COMPLEXAS
             * Estruturas de controel if/else dentro de funções permitem tomar decisões complexas baseadas em muíltiplas conddições;
             * Condicionais Comlexas: permintem cobinas múltiplas conições usando operadores lógicos (&&,||) e comparações para determinar o fluxo de execução;
             * USO COMUM: Verificações de múltiplos critérios, tomadas de decisão em processos complexos e validações de entradas de usuário;
             * Funções com If/Else organizam e centralizam a lógica de decisão, tornando o código mais modular e fácil de manter;
             */

             String r1 = verificarAcesso(20, true, false);
             String r2 = verificarAcesso(17, true, false);
             String r3 = verificarAcesso(21, false,true);
             System.out.println(r1);
             System.out.println(r2);
             System.out.println(r3);
                
                 //funçai com Switch
             System.out.println(obterDiaDaSemana(5));
            }
                      //funçai com Switch
               
    
        // Moved methods inside the class
        public static String verificarAcesso (int idade, boolean temCarteira, boolean temHistoricoNegativo) {
                
                if(idade >= 18 && temCarteira && !temHistoricoNegativo) {
                    return "Acesso permitido.";
                } else if (idade < 18) {
                    return "Acesso negado: menor de idade.";
                } else if (!temCarteira) {
                    return "Acesso negado: carteira de motorista inválida.";
                } else {
                    return "Acesso negado: histórico negativo.";
                }
        }
    
        /* Funções com Switch
        * O Switch é uma estrutura de controle que permite a execução de diferente blocos de código com base no valor de uma expressão;
        * O Switch dentro de uma função é útil quando há Múltiplas conições discretas(casos) a serem Verificadas, como valores interios, caracteres ou Strings;
        * Benefícios: Simplifica a lógica quano comparado a Míltiplos if-else, tonando o código mais organizado e fácil de entender;
        * Boa Prática: Sempre Incluir um defalt para tratar valores inesperados ou casos não cobertos;
        */
        public static String obterDiaDaSemana(int dia) {
            switch (dia) {
                case 1: 
                    return "domingo";
                case 2:
                    return "segunda-feira";
                case 3:
                    return "terça-feira";
                case 4:
                    return "quarta-feira";
                case 5:
                    return "quinta-feira";
                case 6:
                    return "sexta-feira";
                case 7:
                    return "sábado";
                default:
                    return "Dia inválido. Por favor, insira um número de 1 a 7.";
            }
        }
    }
}