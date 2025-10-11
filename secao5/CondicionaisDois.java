public class CondicionaisDois {
   public static void main(String[] args) {
       // 1 condicionais Ternárias
       
       int numero =  10;
       String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
         System.out.println(resultado);


      // 3 precedencia
      boolean a = true;
      boolean b = false;
      boolean c = true;

      // true anda false -> false ou true -> true
      boolean resultado2 = a && b || c;
      System.out.println(resultado2);
   } 
}