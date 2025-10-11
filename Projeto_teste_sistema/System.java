import java.util.Scanner;

public class System {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        boolean rodando = true;
        while(rodando){
        System.out.println("========================System Calçados========================");
        System.out.println("(1) Pre-venda");
        System.out.println("(2) Troca do produto");
        System.out.println("(3) Consulta de Preços");
        System.out.println();
        System.out.println("(9) Cadastrar cliente");
        System.out.println("(8) Modificar valor");

        String escolha = sc.nextLine();
        
        switch (escolha) {
            case "1":
                System.out.println(vendedores[0]);
                break;
            case "2":
                
                break;
            case "3":
                
                break;
            case "4":
                
                break;
            case "5":
                
                break;
            case "6":
                
                break;
            default:
                break;
        }
    }
}
}
