package secao14;
import java.util.Arrays;
import java.util.ArrayList;
public class Lista {
    // Não pode criar uma pasta com nome Array, pois Array é uma classe nativa do Java
    public static void main(String[] args) {
        // 1  listas.

        int[] numeros = {1,2,3,4,5,6,7,8};// as chaves demilitam o array

        // {elem1, elem2, elem3...} Sintaxe de array literal
        System.out.println("Acessando primeiro elemento: "+ numeros[0]);//1

        // tamanho fixo, só que vazio

    String[] frutas = new String[3];//3 elementos, mas vazio

    // 0, 1, 2 => add elementos
    // 3 => não tenho.

    frutas[0] = "maça";
    frutas[1] = "banana";
    frutas[2] = "melancia";
    System.out.println(frutas[2]);

    // não podemos adicionar além do indice já delimitado.
    double[] preços = {1.99, 2.45 , 4.97};

    preços[2] = 5;
    System.out.println(preços[0]);

    // 2 - loops em Arrays
    // somar todos os elementos de um array
    // acessar os elementos e codensar a soma deles em uma var.
    int soma  = 0;

    // length = > A quantidade de elementos de um array
    int i = 0;
    for(i = 0; i < 8; i++ ){
        
        // 1 = 0 ; i > 1; i > 2.... na estrutura. 
        // numeros [i] = numeros [0] => 1
        soma +=  numeros[i];
    }
    System.out.println("soma dos elementos: "+ soma);

    // for each
    // nomear um item => array
    // pessoas => pessoa
    // frutas=> frutas;


    for(String fruta: frutas) {
        System.out.println("A fruta da vez: "+ fruta);
    }

    // encontrar o maior valor de um array

    int [] valores = {10, 25, 8, 22, 1};
    int maiorValor  = valores[0];

    int j = 0;

    while (j < valores.length){

        if (valores[j] > maiorValor){
            maiorValor = valores[j];
        }
        j++;
    }
    System.out.println("o MAIOR VALOR É : " +   maiorValor);

    String nome = "Bruno dos Reis Leal";
    System.out.println(nome.replace(" ", "").length());
     
    // 3 - for each

    for (int numero : numeros) {
        System.out.println("o Numero é: "+ numero);
    }

     String[] palavras = {"Java", "é", "bom!"};

    String frase = ""; // cria uma String vazia. 

    for (String palavra: palavras) {
        frase += palavra + " ";
    }
    System.out.println(frase);
    // verificar se valor está presente em array

    char letraProcurada = 'f';
    char[] letras = {'a','b','c','d','e','f','g'};
    for (char letra: letras) {
        if ( letra== letraProcurada) {
            System.out.println("Achei a letra: "+ letra);
            break;
        }
    }
    String procurado = "bastião";
    String[] pessoas= { "Bruno", "Evelin" , "Luna" , "Alice"};
    for ( String pessoa:pessoas) {
        if (pessoa.equals( procurado))
        System.out.println("Achei o Homi " + pessoa);
        else if(pessoa.equals("Evelin")){
            System.out.println("Nome errado. ");
        }
    }


    // 4 - loops com if

    // filtrar e somar numeros pares.

    int somaPares = 0;

    for( int numero: numeros) {

        if( numero % 2 == 0) {
            somaPares += numero;
        }
        
    }
    System.out.println("Soma dos pares é: " + somaPares);

// exibir valores maiores quie um determinado valor;.
    int[] nums =  {12,6,8,18,24,48,5};

    int limite = 10;

    for( int t = 0; t < nums.length; t++) {
        if ( nums[t] > limite) {
            System.out.println("Valor maior que o limite: "+ nums[t]);
        }
    }
    String[] linguagens = {"Java", "C", "Python", "php"};
    String linguagemAlvo = "Python";
    for (String palavra : linguagens) {
        if(linguagemAlvo == palavra) {
            System.out.println("Linguagem encontrada! parando o Loop!");
            break;
        } else {
            System.out.println("Linguagem ainda não encontrada!");
        }
    }


    // 5  -  Atualizar valores em um array

    for (int u = 0; u < numeros.length; u++) {
        numeros[u] *= 2;

    }
    System.out.println(numeros[1]);

    for ( int numero : numeros) {
        System.out.println("numeros dobrado: " + numero);
    }
    numeros[5] =1;

    System.out.println(numeros[5]);

    for( int t = 0; t < frutas.length; t++){
        if(frutas[t].equals("maça")){
            frutas[t] = "Abacate";
        }
    }
    System.out.println(frutas[0]);

    // 6 - Método ToString

    // Classes no Java, que vão ter metodos utilitários, o Array é uma delas.

    String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);
  
        System.out.println(numeros);

        String dadosFrutas = Arrays.toString(frutas);

        System.out.println(dadosFrutas);
        int[] teste = new int[3];
        System.out.println(Arrays.toString(teste));

        // 7 - Adicionando novos itens a Arrays.

        // ex1: criando um novo array maior e copiando o elementos.
        
        int[] novoArray = new int[numeros.length +1];

        for (int t = 0; t < numeros.length; t++) {
            novoArray[t] =  numeros[t];
        }
        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1]= 4; // esse -1 acessa o ùltimo elemento do array, pois o indice começa em 0.

        System.out.println(Arrays.toString(novoArray));

        // exe2 : usaundo o arraycopy para copiar os elemenstos. 

        String[] novoFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0 , novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length -1] = "Jabuticaba";
        System.out.println(Arrays.toString(novoFrutas));

        // ex3: usando ArrayList.
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maça", "banana", "Laranja"));
        ArrayList<Integer> listaNumeros = new ArrayList<>(Arrays.asList(32, 45, 67));

        System.out.println(listaFrutas);
        System.out.println(listaNumeros);
        
        listaNumeros.add(89);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);
         System.out.println(listaNumeros);

         // 8 Reference Trap

         int[] arrayOriginal = { 1,2,3,4,5};
         int[] arrayCopia = arrayOriginal;

         
         arrayCopia[0] = 10;

            System.out.println(Arrays.toString(arrayOriginal));
            System.out.println(Arrays.toString(arrayCopia));
            
            // Como Evitar isso. 

            int[] arrayClone = arrayOriginal.clone();

            arrayClone[0] = 999;
            arrayClone[2] = 99;
            

            System.out.println(Arrays.toString(arrayOriginal));
            System.out.println(Arrays.toString(arrayClone));

            // 9 = Arrays 2D (matrizes);
            // [[1,2], [3,4], [5,6]]
            // array[0][1]

            int[][] matriz = {
                {1,2},
                {3,4},
                {5,6}
            };
            System.out.println(matriz[2][1]);

            int[][] tabela = new int[3][3];

            tabela[0][0] = 15;
            tabela[1][1] = 10;
            tabela[2][2] = 12;

            for(int[] linha : tabela) {
                System.out.println(Arrays.toString(linha));
            }

        
            int[][] grade = new int[4][5];

            for (int m = 0; m < grade.length; m++) {
                for(int n= 0; n < grade[m].length; n++) {
                    grade[m][n] = m * n;
                }
            }
            for(int[] linha : grade) {
                System.out.println(Arrays.toString(linha));
            }
    }
}
