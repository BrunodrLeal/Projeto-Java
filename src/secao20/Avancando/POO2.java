package secao20.Avancando;

import java.lang.reflect.*;

public class POO2 {
    public static void main(String[] args) {
        
        // 1 classes com final

        ContaBancaria conta = new ContaBancaria(500);

        System.out.println("Saldo: "+ conta.getSaldo());

        // Classe final - não se herda
        // metodo final = n pode ser sobreescrito.

        // 2 - reflection API
        try {
           Class<?> classePessoa = Class.forName("secao20.Avancando.Pessoa");

            Constructor<?> construtor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = construtor.newInstance("João", 25);
            
            Method metodoDizerOla = classePessoa.getMethod("dizerOla");

            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");

            campoNome.setAccessible(true);

            campoNome.set(pessoa, "Maria");

            metodoDizerOla.invoke(pessoa);

        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
    }
}
