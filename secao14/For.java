package secao14;

public class For {
    public static void main(String[] args) {
        // exerc 1: 

        int[] numero = {1,2,3};
        int[] arrayInvertido = new int[numero.length];

        for(int i = 0; i < numero.length; i++) {
            arrayInvertido[i] = numero[numero.length - 1 - i];
        }

        System.out.println("Array original: " + java.util.Arrays.toString(numero));
        System.out.println("Array invertido: " + java.util.Arrays.toString(arrayInvertido));
        

        // exerc 2:

        String[] palavras = {"java", "python", "c++","Bruno", "java", "conter-Strike", "c", "java"};
        
}
    
    
}
