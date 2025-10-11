public class LoopsB {
    public static void main(String[] args) {
        

        // 8 loops externos

        externo:
        for(int i = 0;i < 3; i++) {
            
            for(int j = 0; j < 3; j++){
                
                if (i == 1 && j == 1){
                    break externo;
                }
                System.out.println(" i " + i + " j " + j);
                System.out.println("divisão: " + i / j);
            }
        }

            // loops internos
        
        for(int i = 0;i < 3; i++) {
            interno:
            for(int j = 0; j < 3; j++){
                if(j == 2) {
                    System.out.println("Parou  interno");
                }
                System.out.println(" i " + i + " q " + j);
            }
        }

        // 9 -  off by one

        // executar 5 vezes.
        for(int i = 0; i <= 5; i++) {

            System.out.println(" I: " + i);
        }
        // fim do estrutura de repetição
    }
}
    

