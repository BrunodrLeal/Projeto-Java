package secao18;

import java.util.*;
public class Bilhete {

    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhido){
        this.numerosEscolhidos = numerosEscolhido;
    }

    public void realizarSorteio(){
        // sorteio
        Random random = new Random();
        resultadoSorteio = new int[6];
                
        for( int i =0; i < resultadoSorteio.length; i++){
            resultadoSorteio[i] = random.nextInt(60)+1;
        }

        Arrays.sort(resultadoSorteio);
    }

    public int contarAcertos(){
        int acertos = 0;

        for(int numerosEscolhido : numerosEscolhidos){
            for(int numeroSorteio : resultadoSorteio) {
                if(numerosEscolhido == numeroSorteio){
                    acertos++;
                    break;
                }
            }
        } 
        
        return acertos;
    }



    public void exibirResultado(){
        System.out.println("Números escolhidos: "+ Arrays.toString(numerosEscolhidos));
        System.out.println("Números sorteados: " + Arrays.toString(resultadoSorteio));
        
        int acertos = contarAcertos();

        System.out.println("Você acertou " + acertos + " acertos. ");
        System.out.println("");


    }
}
