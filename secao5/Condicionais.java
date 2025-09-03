public class Condicionais
 {
   /*  Operadores de comparação
   * ==  igual a : Verifica se dois valores são iguais;
   * !=  diferente de : Verifica se dois valores são diferentes;
   * >   maior que : Verifica se o valor da esquerda é maior que o da direita;
   * <   menor que : Verifica se o valor da esquerda é menor que o da direita;
   * >=  maior ou igual a : Verifica se o valor da esquerda é maior ou igual ao da direita;
   * <=  menor ou igual a : Verifica se o valor da esquerda é menor ou igual ao da direita;
   * Exemplo de uso:
   * boolean resultado = (a == b);
   * boolean resultado = (a != b);
   * boolean resultado = (a > b);
   * boolean resultado = (a < b);
   * boolean resultado = (a >= b);
   * boolean resultado = (a <= b);
   * 1 - oque é boolean? ele só recebe true ou false sempre.*/
   
   public static void main(String[] var0) {
      boolean var1 = true;
      boolean var2 = false;
      boolean var3 = true;
      boolean var4 = var1 && var2 || var3;
      System.out.println(var4);
      
      boolean var5 = var1 || var2 && var3;
      System.out.println(var5);
      
      int x = 10;
      System.out.println(x == 5);
      System.out.println(x != 5);
      System.out.println(x > 5);
      System.out.println(x < 5);
      System.out.println(x >= 5);
      System.out.println(x <= 5);
      System.out.println(x == 5); 
      

      /* 3 - Atribuição e comparação
       * Atribuição (=);
       * Atribui um valor a uma variável.
       * Usado para definir ou alterar o valor de uma variável.
       * Exemplo de uso:
       * int a = 5;
      
       * Comparação' (==);
       * Compara dois valores para verificar se são iguais.
       * Retorna true se os valores forem iguais, caso contrário, retorna false.
       * Exemplo de uso:
       * 5 == 5 retorna true;

       */
      int n = 5;
      int m = 10;
      System.out.println(n = 12); 
      System.out.println(n);     
      System.out.println( n == m);

      /* 4  - Comparação de Strings
       * Problema com ==;
       * O Operador == compara as referências de memória, não o conteúdo das strings.
       * pode retornar false mesmo que o conteúdoo das Strings seja igual, se as referências fores diferentes;
       * USO DO MÉTODO EQUALS();
       * Equals() compara o conteúdo das Strings, caractere por caractere;
       * é a maneira correta  e segura de verificar se duas strings são iguais em valor;
       * equalsIgnoreCase() 
       * compara o conteúdo das Strings ignorando diferenças de maiúsculas e minúsculas;
       */
      String str1 = new String("Java");
      String str2 = new String("Java");
      System.out.println(str1 == str2); 
      System.out.println(str1.equals(str2)); 
      System.out.println(str1.equalsIgnoreCase("java")); 
   }
}    

