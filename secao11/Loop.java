public class Loop {
    public static void main(String[] args) {
        //1 - for
        // loop que vai rodar de 1 a 5.
        // Variavel de inicialização = i,j,k
        // Condição -> determina até quando ou quantas vezes, o oop vai rodar
        // incremento - > a variável vai chegar na condição
       
        //for(int i = 0; i <= 10; i++) {
            // repetir
         //System.out.println("Contador:" + i);
            //}
        
        // mostrar cada caractetrer de uma String.
            //String palavra = "java";
            //for(int i =0; i < palavra.length(); i++) {
            //System.out.println("Caractere: " + palavra.charAt(i));;
     //}
        
        // contagem regreciva
        //for(int i = 10; i > 0; i--) {
            //repetir
            //System.out.println("Contador:" + i);
    //}
        //// 2 while
            //int i = 0;
            //while(i <=10){

            //System.out.println("Whille Contador: " +i);
            //i++;

    //}

        //int valor = 0;

            //while(valor != 7) {

            //valor = (int)(Math.random() * 10);
            //System.out.println("Valor aleatório: " + valor);
        //}
        //for(int z = 0; z <= 5 ; z--) {
            //System.out.println(z);
        
        
        // 3 do while
        //int y = 10;
        //for (int z = 0; z <= 10; z++) {
            //System.out.println("o valor de z é: " + z);

            //if (z == 5) {

                //System.out.println("parando Loop");
               //break;
            //}
        //}
        // 6 - continue

        for (int w = 10; w > 0; w--) {

            System.out.println("Teste");

            if (w % 2 == 0) {
                System.out.println("par");
                continue;
            }
            System.out.println("contador: "+ w);

        //}

        // 7 nested loops

        //for (int m = 1; m <= 10; m++) {
            //System.out.println("EXTERNO");
              //for( int n = 1; n <= 3; n++) {
                //System.out.println(m + " x " + n + " = " + (m*n));
              //}
        //}
        // padrao  de estrelas.

        //for ( int o = 10; o <= 15; o++) {
            
            //for( int p = 10; p <= o; p++) {
                //System.out.println("*");
            //}
            //System.out.println();

        //}
    }
    }}
