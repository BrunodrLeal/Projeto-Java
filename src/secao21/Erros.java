package secao21;

import java.io.*;

public class Erros {
    public static void main(String[] args) {
        
        // 1  =  try catch

        try {
            
            int a = 0;
            int b = 10;

            int resultado = b / a;

        } catch (ArithmeticException e)  {
            System.out.println("Divisão por 0 não é possível.");
        }

        try {
            
            int [] numeros = { 1,2,3};

            System.out.println(numeros[3]);

        } catch (Exception e) {
            // TODO: handle exception

            System.out.println("Erro genérico");

            System.out.println("msg: " + e.getMessage());
        }

        // Excessão e o erro. 

        // 2 - Bloco Finally

        // nesse exemplo o erro é presente e o finally é executado.
        try {
            
            int [] numeros = { 1,2,3};

            System.out.println(numeros[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception

            System.out.println("Erro genérico");

            System.out.println("msg: " + e.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }
        
        // esse exemplo ele mostra como é quando funcionao o Try catch e o finally sempre executa.
        try {
            
            int [] numeros = { 1,2,3};

            System.out.println("Acessando indice existente: " + numeros[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception

            System.out.println("Erro genérico");

            System.out.println("msg: " + e.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }

        // try sem catch tambem o finally sempre vai executar
        try {
            
            int [] numeros = { 1,2,3};

            System.out.println("Acessando indice existente: " + numeros[2]);

        } finally {
            System.out.println("Executou o finally");
        }

        // 3 - Verificadas e não verificadas. 

        // verificada

        try {
            BufferedReader reader =  new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erro ao ler arquivo " + e.getMessage());
        }

        // Não verificadas.
        String texto = null;

        //System.out.println(texto.length());
            
        // execução do exemplo 4
        try {

            validarIdade(20);
            validarIdade(10);
            
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        }   

        // 4 -  class throwable

        public static void validarIdade(int idade) {
            if(idade < 18) {
                throw  new IllegalArgumentException("Idade deve ser maior que 18.");
            }
            System.out.println("Idade válida :" + idade);
        }    
}

