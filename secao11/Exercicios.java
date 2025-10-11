
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner sc =new Scanner( System.in);
        //loop();
        //par();
        primo(sc);
    }
    public static void loop() {
        int somatorio = 0;
        
        for(int i = 0; i <= 100; i++) {
            somatorio +=i;
        }
        System.out.println("Soma de 1 a 100: " + somatorio);
    }
    public static void par() {
        int par = 1;
        while (par <= 20) {
            if (par % 2 == 1){
                System.out.println("Numero par: " + par);
            }
            par++;
        }
    }
    public static void primo(Scanner sc) {
        System.out.println("Digite um número");
        int n = sc.nextInt();
        for (int i = 2; i < n;i++){
             if(n % 2 ==1) {
            System.out.println("Esse numero é Primo");
        } else{
            System.out.println("Esse numero não é Primo");
        }
    
        }
    }
}
            
        

       
    

