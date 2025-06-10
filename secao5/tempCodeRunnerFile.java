    // 1 condicional ternária
    //     int numero = 11;
    
    //     String resultado = (numero %2 == 0)? "par" : "Impar";
    //     System.out.println(resultado);
    
    // esse formato é para operações simples que facilita e resume tudo em uma linha somente.
    
    
    // /* if encadeado */
    public class tempCodeRunnerFile {
        public static void main(String[] args) {
            int idade =  19;
    
            boolean temCarteira = true;
    
            if (idade >= 18){
    
                if(temCarteira) {
                    System.out.println("pode dirigir");
                }
                else{
                    System.out.println("precisa ter a carteira para dirigir");
                }
            } else {
                System.out.println("Você não pode dirigir ainda");
            }
        }
    }
    