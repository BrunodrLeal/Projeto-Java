package secao23;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        
       // 1 = classes generics
       Caixa<Integer> caixaInteira = new Caixa<>();
       caixaInteira.adicionar(100);

        System.out.println(caixaInteira.obter());
       
        Caixa<String> caixaTexto = new Caixa<>();

        caixaTexto.adicionar("conteudo");

        System.out.println(caixaTexto.obter());

        Caixa<Boolean> caixaBoo = new Caixa<>();

        caixaBoo.adicionar(true);

        System.out.println(caixaBoo.obter());
        

        // Metodos genericos. 

        System.out.println("Maior valor entre 5 e 10: " + obterMaior(5, 10));

        System.out.println("Maior valor entre JAva e Python: " + obterMaior("Java", "Python"));
        
        String[] letras = {"a", "b" , "c" , " d"};

        Integer[] numeros= {12,14,156,16,16};

        Boolean[] bools = { true, false, false, true};

        imprimirArray(letras);
        imprimirArray(numeros);
        imprimirArray(bools);

        System.out.println();

        // 3 - bounded Types

        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("maior numero entre 20 e 10: " + comparadorInteiros.obterMaior(20, 10));

        Comparador<Double> comparadorInteiros2 = new Comparador<>();

        System.out.println("maior numero entre 1.95 e 4.55: " + comparadorInteiros2.obterMaior(1.95, 4.55));

        // 4 - wildcard

        List<Integer> numero2 =  List.of(1,2,3);
        List<String>  palavras = List.of("Bruno", "Evelin" ,  "ALice");
        
        // aceita qualquer tipo de lista
        imprimirLista(numero2);
        imprimirLista(palavras);

        // somente lista numericas (? extends Number)

        somarNumeros(numero2);
        //somarNumeros(palavras);  Erro.

        // aceita apenas tipos numeros especificos.

        List<Integer> numeros3 = new ArrayList<>();

        adicionarNumeros(numeros3);
        
        for(Integer numero : numeros3){
            System.out.println(numero);
        }
        
        // 5 - Generics com collections.

        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        listaInteiros.add(40);
        listaInteiros.add(50);

        for(Number numero : listaInteiros) {
            System.out.println(numero);
        }

        Set<String> conjuntoDePalavras = new HashSet<>();

        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Java");
        conjuntoDePalavras.add("Collections");

        for(String palavras1 : conjuntoDePalavras) {
            System.out.println(palavras1);
        }

        Map<String , Integer> mapaDeIdades = new HashMap<>();

        mapaDeIdades.put("mateus" ,  36);
        mapaDeIdades.put("Bruno", 36);

        for(Map.Entry <String, Integer>entrada : mapaDeIdades.entrySet()){
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos de idade");
        }

        // 6 Generics com interfaces
        Armazenamento<String> aTexto = new ArmazenamentosTexto();

        aTexto.salvar("Teste");
        System.out.println(aTexto.recuperar());

        Armazenamento<Integer> aNumero = new ArmazenamentoNumeros();

        aNumero.salvar(50);
        System.out.println(aNumero.recuperar());

        // 7 - restrição de multipla de Tipos.
        Pato pato = new Pato();

        CriaturaGenerica<Pato> criaturaPato = new CriaturaGenerica<Pato>(pato);

        criaturaPato.usarHabilidades();

    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2) {
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array) {
        for(T elemento : array) {
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista) {
        for(Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista) {
        double soma = 0;
        for(Number numero : lista) {
            soma += numero.doubleValue();
        }

        return soma;
    }

    public static void adicionarNumeros(List<? super Integer>lista) {

        for(int i = 1; i <= 5; i++ ) {
            lista.add(i);
        }
    }
 }
