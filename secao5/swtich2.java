public class swtich2 {

    public static void main(String[] args) {
      
        // 11 switch e break
        /* Switch: Estrutura de controle que permite escolher entre várias opções com base no valor de uma expressão;
         * Case: Define uma posível opção ou caminho dentro do Switch. casa case é seguido por um valor específico que é comparado com a expressão do Switch;
         * Break: Utilizado para encerrar uma execução de um bloco case. Evita que o código "caia" nos casos seguintes;
         * Importante: cada case deve terminar com um Break(ou Outro Comando de Desvio) para evitar a execução de outros casos;
         * Valores Excluivos: OS valores em case devem ser exclusivos e correspondentes ao trpo da expressão do switch;
         */
        // validar dia da semana paseado em numero.
        // 1 = a Segunda
        // 7 = a Domingo

        int diaDaSemana = 1;
        switch (diaDaSemana){
       
            case 1:
                System.out.println(" Domingo ");
                break;
            case 2:
                System.out.println(" Segunda-feira   ");
                break;
            case 3:
                System.out.println(" Terça-feira ");
                break;
        }

        // 12 Defaut. ele é o Else do switch
        /* Defoult: o Bloco default é executado quando nengum os valores especficados nos case corresponde a expressão o switch
         * Opcional: o Uso de Default é opcional, mas recomendado para capturar todos os casos não previstos;
         * posição: normalmente é colocado no final do Switch, mas pode aparecer em qualquer lugar dentro do bloco;
         * sem break necessário: como default geralemtne é o último bloco, não é necessário usar o break, mais pode ser incuído se o defalut não for o último;
         * fornceum comportamento pad~rao ou uma mensagem de erro quando nenhum caso específico é atendido;
         * Exemplo: se o usuário inserir um número fora do intervalo esperado, o bloco default pode exibir uma mensagem de erro ou um valor padrão;
         * o Default é p else do switch
         */

        int n = 1;
        switch (n) {
            case 1:
                    System.out.println(" È 1");
            case 2:
                    System.out.println(" È 2");
           default: 
                    System.out.println( " Numero não encontrado");
        }


      
    }
}

