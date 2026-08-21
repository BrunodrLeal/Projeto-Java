package secao18;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

        // solicitando bilhetes para o usuario.
        while (true) {
            System.out.println("Digite os 6 números para seu bilhete(entre 1 e 60): ");
         
            // usuario escolhe os números
            int[] numerosEscolhidos = new int[6];
            
            for(int i = 0; i < numerosEscolhidos.length;i++){
                System.out.println("Digite o número " + (i + 1) + ": ");

                numerosEscolhidos[i] = sc.nextInt();
            }
            
            // criando o bilhete
            Bilhete bilhete = new Bilhete(numerosEscolhidos);

            bilhetes.add(bilhete);
            
            // pergunta se o usuário quer continuar.
            System.out.println("Deseja registrar ouro bilhete?(s / n) ");

            String resposta = sc.next();
            
            if(resposta.equals("n")){
                break;
            }
        }

        // Realizando o sorteio
        System.out.println("realizando o sorteiro...");
        for(Bilhete bilhete : bilhetes) {
                bilhete.realizarSorteio();
                bilhete.exibirResultado();
            }

        sc.close();          
    }
}

