package secao2;

import java.util.Scanner;

public class variavel {

    public static void main(String[] args) {

        String nome;
        Double despesa1;
        Double despesa2;
        Double despesa3;
        Double total;
        Scanner entradausuario = new Scanner(System.in);

        System.out.println("Qual o seu nome?");

        nome = entradausuario.nextLine();
        System.out.println("Qual o valor da primeira despesa?");
        despesa1 = entradausuario.nextDouble();
        System.out.println("Qual o valor da segunda despesa?");
        despesa2 = entradausuario.nextDouble();
        System.out.println("Qual o valor da terceira despesa?");
        despesa3 = entradausuario.nextDouble();
        total = despesa1 + despesa2 + despesa3;

        System.out.println("Olá " + nome + ", Suas Despesas são de : " + total);

        entradausuario.close();
    }
}