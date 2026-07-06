package secao18;

import java.util.*;


public class Bilhete {
    int bilhete;
    private int[] numerosEscolhidos = new int[6];
    private int[] resultadoSorteio = new int [6];

    public void numerosEscolhidos(int indice, int numero){
        numerosEscolhidos[indice] = numero;
    }
    public int[] getNumerosEscolhidos(){
        return numerosEscolhidos;
    }
    public void setNumeroEscolhido(int indice, int numero) {
    numerosEscolhidos[indice] = numero;
    }
    public void realizarSorteio(){
        Random random = new Random();
                
        for( int i =0; i < resultadoSorteio.length; i++){
            resultadoSorteio[i] = random.nextInt(60)+1;
        }
        Arrays.sort(resultadoSorteio);
        for (int numero : resultadoSorteio) {
        System.out.print(numero + " ");
        }

    }

}
