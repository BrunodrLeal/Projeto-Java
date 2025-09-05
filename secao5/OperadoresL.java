public class OperadoresL {
    public static void main(String[] var0) {

   // Operadores lógicos
   // && (E lógico), || (OU lógico), ! (NÃO lógico)

   // && (E lógico) - Retorna verdadeiro se ambos os operandos forem verdadeiros
   // || (OU lógico) - Retorna verdadeiro se pelo menos um dos operandos for verdadeiro

   // Exemplo de uso:
   // boolean resultado = (a > b) && (c < d);
   // boolean resultado = (a > b) || (c < d);
   // boolean resultado = !(a > b);
   // 1 - oque é boolean? ele só recebe true ou false sempre.
      
    /*Trabalhando com o AND
      * Operador &&( AND lógico) retorna true se ambas as condições fores verdadeiras. 
      * Sistaze: Condição1 && Condição2;
      * Curto-circuito: Se a primeira condição for falsa, a segunda não é avaliada.
      * Uso comum: Combinação de múltiplas condições que precisam ser verdadeiras ao mesmo tempo;
     */
      // 8 - AND

      int idade = 18;
      boolean cnh = true;

      System.out.println(idade >= 18 && cnh); // não é preciso colocar ==true seria uma redundançia, exemplo abaixo.  
      System.out.println(idade >= 18 && cnh == true); // essa opção é a redundandte

      boolean cnhVencida = true;

      System.out.println(idade >= 18 && cnh && cnhVencida == false);

    int a = 10;
    int b = 20;
    
    // true && true = true
    if(a > 5 && b > 10) {
      System.out.println("Deu certo");
    }

    // false && true = false (curto-circuito)
    if(a < 55 && b > 10) {
      System.out.println("Deu certo");
    }

  // ===========================================================================================================================//

  // 9 - OR

  boolean estaChuvendo= true;
  boolean temGuardaChuva = false;

    System.out.println(estaChuvendo || temGuardaChuva);
    System.out.println(10 > 20 && 100 == 200);

    int idade2 = 16;
    boolean ehMembro = true;
     
    // o usuário pode participar do clube
    // ele precisa ter > 16 ou ser membro.

    if ( idade2 > 16 || ehMembro) {
      System.out.println("você pode entrar");
    } else {
      System.out.println("Entrada negada.");
    }
    

  }
}
// fim da explicação
   

