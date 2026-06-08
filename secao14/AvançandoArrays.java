package secao14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
    
    public class AvançandoArrays {
    
        public static void main(String[] args) {
    
            // 1 - ordenação.
    
            // Ordenação Array de inteiros
    
            int[] numbers = {5,6,9,8,5,70,12,1,23,2,3};
    
            // modifica o arraus origial
            Arrays.sort(numbers);
    
            System.out.println(Arrays.toString(numbers));

            // Ordenacao com comparator

            String[] name = {"João" , "Bob" , "Pedro" , "Marco"} ;

            Arrays.sort(name, Comparator.reverseOrder());

            System.out.println(Arrays.toString(name));

            // ordenacao de matriz

            int[][] matriz = {
                {4,5,2},
                {6,2,1},
                {9,8,6}
            };

            Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

           // Imprimir Matriz sem foreach. usando o deepToString
            System.out.println(Arrays.deepToString(matriz));
        
            // Arrays.copyOf();

            //2 manipulação avançada.
            int[] original = {1,2,3};
            
            int[] copia = Arrays.copyOf(original,3);

            System.out.println(Arrays.toString(copia));

            // fill - Preenchimento.

            int[] numeros = new int[5];

            System.out.println(Arrays.toString(numeros));

            Arrays.fill(numeros, 5); // essa função preenche todo o array com o mesmo numero.

            System.out.println(Arrays.toString(numeros));

            // transformando de Array para Stream

            int[] values = {1,2,3,4,5};

            // Somando de outra forma.
            int sum = Arrays.stream(values).sum();

            System.out.println(sum);

            // Arrays dinamicos.

            ArrayList<String>frutas = new ArrayList<>();

            System.out.println(frutas);

            frutas.add("maça");
            frutas.add("Banana");
            
            System.out.println(frutas);

            frutas.remove(1);

            System.out.println(frutas);

            String frutaespecifica = frutas.get(0); // esse motodo tira o objeto do Array
                
            System.out.println(frutaespecifica);

        }
    }

