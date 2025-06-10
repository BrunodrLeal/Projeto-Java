public class OperadoresL {

   // Operadores lógicos
   // && (E lógico), || (OU lógico), ! (NÃO lógico)

   // && (E lógico) - Retorna verdadeiro se ambos os operandos forem verdadeiros
   // || (OU lógico) - Retorna verdadeiro se pelo menos um dos operandos for verdadeiro

   // Exemplo de uso:
   // boolean resultado = (a > b) && (c < d);
   // boolean resultado = (a > b) || (c < d);
   // boolean resultado = !(a > b);
  public static void main(String[] var0) {
      boolean var1 = true;
      boolean var2 = false;
      System.out.println(var1 || var2);
      System.out.println(false);
      byte var3 = 16;
      boolean var4 = false;
      if (var3 <= 16 && !var4) {
         System.out.println("Entrada Negada!");
      } else {
         System.out.println("Voc\u00ea pode entrar");
      }
    }
}
// fim da explicação
   

