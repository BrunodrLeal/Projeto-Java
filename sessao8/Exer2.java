package sessao8;
import java.util.Scanner;



public class Exer2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        tabuada(sc);

        System.out.println("Deseja executar novamente");
        String retorno  = sc.nextLine();
        while(retorno.equals("sim")) {
            tabuada(sc);

        System.out.println("Deseja executar novamente");
            retorno  = sc.nextLine();
        }
        System.out.println("fim do programa. ");
    
    }
    public static void tabuada(Scanner sc) {
        int resultado = 0;
        String resultado1 = " ";
        boolean confirmado =false;
        boolean retorno1 =false;
    
        while(!retorno1) {
        System.out.println("Digite um número: ");
           int num = sc.nextInt();
        System.out.println("Digite um limite: ");
           int lim = sc.nextInt();
           sc.nextLine();
        System.out.println("selecione o operador(+,-,/,*)");
            String oper = sc.nextLine();
            
            while(!(oper.equals("+") || oper.equals("-")|| oper.equals("/")|| oper.equals("*"))){
                System.out.println("selecione o operador(+,-,/,*)");
                    oper = sc.nextLine();
                }
            
            while(!confirmado) {
                System.out.println(" ");
                System.out.println("=====================================Conferência:===================================== ");
                System.out.printf("Número escolhido foi: %d%n limete: %d%n operador: %s%n",num,lim,oper);
                System.out.println(" ");
                System.out.println("Está correto (sim/não)");
                String resposta = sc.nextLine();
                switch (resposta){
                   
                case "não":
                System.out.println(" ");
                System.out.println("Vamos recomeçar...");
                tabuada(sc);

                case "sim":
                confirmado= true;
                
                for(int i = 1 ; i <= lim; i++){
                
                    if (oper.equals("+")) {
                        resultado = num + i;
                        } else if(oper.equals("-")) {
                        resultado = num - i;
                        } else if(oper.equals("/")) {
                        resultado = num / i;
                        } else if(oper.equals("*")) {
                        resultado = num * i;
                        } else {
                        System.out.println("Operador errado, tente novamente");
                    }
                 System.out.println(num + " " + oper + " " + i + " = " + resultado );
                }
            }
            }
        }
    }
}


