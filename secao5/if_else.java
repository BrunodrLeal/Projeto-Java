public class if_else {

      public static void main(String[] args) {
        
        
        int numero = 100; // Declarando uma variável do tipo inteiro e atribuindo o valor 100
        
        // baseado em uma comparação eu executo algo.
            System.out.println("O numero é maior que 50");
        
        
            // 5 if
        /* if executa um bloco de código se a conição for verdadeira;
         * coloque a condição entre parênteses após a palavra-chave if;
         * Uso comum: Comparações lógicas ou aritméticas para tomar decisões no código;
         * importante: o bloco de código dentro de if é determinado por chaves{};
         */

        int numero2 = 100;
            // baseado em uma comparação eu executo algo.
        if (numero > 90 ) {
            System.out.println("o numero é menor que 100");
           
        }
            //if com Strings

        String texto = "teste";

        if(texto.equals("teste")) {
            System.out.println("O texto é igual a teste");
        }
        
        int a = 10;
        int b = 20;
        if (a < 11 && b > 22) {
            System.out.println("A é maior que 11 e B é menor que 22");
            /* Explorando Else.
             * else executa um bloco de código se a condição for falsa;
             * Proporciona uma alternativa no fluxo de execução do programa;
             * Sintaxe: O bloco else vem logo após um bloco if;
             * Bloco único: Somente um bloco else pode seguir um if;
             * Importante: Sempre use {} para determinar o bloco de código do else. 
             */
        } else {
            System.out.println("A não é maior que 11 ou B não é menor que 22");
        } 
        /* Utilizando o Else IF
           * Else if permite testar condições adicionais após um if;
           * Sintaze: coloque a conição entre parênteses após a palavra-chave else if;
           * Uso comum: Quando há várias conições mutuamente exclusivas;
           * Encadeamento: Vários blocos else if podem ser usados após um if;
           * Bloco final opcional: Pode ser seguido de um else para ligar com qualquer caso não coberto;
        */
        // 7 else if
        double nota = 8.5;

        if ( nota>=9) {
            System.out.println("Nota muito boa");
        } else if(nota >= 7){
            System.out.println("acima da média");
        } else{
            System.out.println("abaixo da média");
        } 
        /* Não há limites para o else if. podera usar todas as alternativas possíveis */       // // OR
        //finalizado "if, else, else if"
        
   

    }
}
