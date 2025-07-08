package sessao8;



public class funcoesb {         
    
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

                 // 7 system exit
                 verificarAutenticação("admin" ,  "senhaSegura");
                 System.out.println("oi");
                 System.out.println(calcularMedia(5, 6, 7));
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

        /*  Funções com System.exit
         * O método System.exit(int status) encerra imediatamente a execução do programa, Finalizando todas as operações em andamento;
         * o Argumento in status indica o estado de termino do programa, um valor de 0 geralmente indica uma saída bem-sucedida, enquanto valores diferentes de 0 indicam erros;
         * Como o System.eit termina o programa abruptamente, deve ser usado com cuidado, normalmente em situalções de erro crítico ou quando não há mais naad a ser feito;
         * CASOS DE USO:
         * Tratamento de erro: em cenários onde o programa não pode continuar devido a um erro crítico;
         * interrupção controlada: quano o programa atinge um estado em que deve ser encerrado imediatamente, como após confirmar a saída do usuário;
         */

         public static void verificarAutenticação ( String usuario, String senha) {
            if(!usuario.equals("admin") && !senha.equals("senhaSegura")) {
                System.out.println("Autenticação Falhou!");
                System.exit(1);
            }
            System.out.println("Autenticação bem-sucedida!");

         }
         
         /* 8- Documentação Funções
          * Oque é Documentação de Função:
          * Fornece informações etalhadas sobre oque a função faz, seus parâmentos, valor de retorno , e outros detalhes relevantes;
          * Utiliza o formato JAVADOC  para gerar documentação automática e legível, que pode ser visualizada em IE e ferramentas de ocumentação;
          * Facilita a compreensão e manutenção do código, especialemtne em projetos colaborativos ou de Grande escala;
          ** Componetes da Documentação:
          * Descrição geral: Explica o propósito da função e o que ela faz;
          * Parâmetros: @param: Descreve os parâmetros de entrada, Incluindo seus tipos e o que representam
          * Valor de Retorno: @return: Descreve o que a função retorna, se aplicavel;
          * Exceções @throws: Inica quais Excessões a função pode Lançar, se houver;
          */
          public static double calcularMedia(int num1, int num2, int num3) {
            return ( num1 + num2 + num3) / 3.0;
          } 
         
    }
    
