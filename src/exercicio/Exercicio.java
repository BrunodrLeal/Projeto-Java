package exercicio;

class exercicio {
    
    public static void main(String[] args) {
        Celular iphone = new Celular();
        Celular iphone2 = new Celular();
    
        iphone.marca = "Apple";
        iphone.modelo = "17 1Pro Max";

        iphone.ligar();
        iphone.desligar();
        iphone.usar(85);

        iphone2.marca = "Apple";
        iphone2.modelo = "15 1Pro Max";

        iphone2.ligar();
        iphone2.desligar();
        iphone2.usar(80);



        Aluno bruno = new Aluno("Bruno Leal", 123, 95.68);
        Aluno evelin = new Aluno("Evelin" , 124 ,  85.3);

        bruno.setNome("Bruno dos Reis Leal");
        
        bruno.setMatricula(195);
        
        bruno.setNotaFinal(101);

        bruno.exibirInfo();

        evelin.setNome("Evelin Sueelen de souza Castro");
        
        evelin.setMatricula(500);
        
        evelin.setNotaFinal(95);

        evelin.exibirInfo();

        ContaCorrente conta1 = new ContaCorrente("bruno", 1000,1100);

        conta1.depositar(1);
        conta1.exibirSaldo();
        conta1.sacar(1000);
        
        ProdutoEletronico produto = new ProdutoEletronico("Notebook", 5000, 12);

        produto.desconto(60);
        produto.exibirInfo();
    }
}



