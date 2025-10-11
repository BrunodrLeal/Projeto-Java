import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    
    public static void main(String[] args) {
        //12  - Função resurciva.

        // Recursão é a técnica onde uma função chama a si mesma para resolver um problema que pode ser dividido em subproblema menores e semelhantes ao original;
         // Um caso base/cenário é essencial para terminar a recursão, se ele, a função entratia em um loop infinito
         // Como funciona: O problema é dividido em subproblemas menores até atingir o caso cabe, após o qual a solução começa a ser construida ao "subir" a pilha de chamadas;
         // Pode ser ineficiente em termos de tempo e memória, especialmente para problemas grandes, devido á sobrecarga de chamas de função.//
       
         int soma = somaRecurciva(100);
            System.out.println(soma);

            Runnable tarefa = () -> System.out.println("minha Função anonima.");
        tarefa.run();
        //(arg1, arg2) -> {} formato para as Lambdas

        List<String> nomes = Arrays.asList("Ana","Pedro", "Jose");
        
        nomes.forEach(nome -> System.out.println(nome));
    }

    public static int somaRecurciva( int  n) {

        if(n ==1) {
            return 1;
        } else {
            return n + somaRecurciva(n -1);
        }
    }
    
    }
    
