package secao14;


import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        qtde(sc);
        
    }
    public static void qtde (Scanner sc){
        System.out.println("Quantos Array");
        int qtdes = sc.nextInt();
        sc.nextLine();

        int [] numero = new int[qtdes]; // cria um array do tamanho que o uisuário pede.
       
        for(int i = 0; i < qtdes;i++) {
            System.out.println("Digite o número" + (i+1)+":");
            numero[i] = sc.nextInt();
            
            
        }
        int soma = 0;
        for (int i = 0;i < numero.length; i++) {
            soma+= numero[i];
        }
        System.out.println("A soma dos Números é:" + soma);

        int maiorValor = numero[0];
         int j = 0;
         while(j < numero.length) {
            if (numero[j] > maiorValor){
                maiorValor = numero[j];

            }
            j++;
         }
         System.out.println("o maior valor desses Array são : " + maiorValor);
        
         int menorValor = numero[0];
         int k = 0;
         while(k < numero.length) {
            if( numero[k] < menorValor){
                menorValor = numero[k];
            }
            k++;

         }
         System.out.println("menor número:" + menorValor);

         double media = (double) soma / numero.length;
          System.out.println("A media dos arrays são: "+ media);
        
          }
        
         }
    
    
 
        


