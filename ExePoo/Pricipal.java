package ExePoo;

public class Pricipal {
    public static void main(String[] args) {
        // exe 1
        Celular celular = new Celular();

        celular.marca = "Apple";
        celular.modelo = "Iphone 15";
        
        celular.Ligar();
        celular.Desligar();
        celular.Usar(10);
        
        Celular S10 = new Celular();

        S10.marca = "Sansung";
        S10.modelo = "S10";

        S10.Ligar();
        S10.Desligar();
        S10.Usar(50);
        // exe 2 
        Aluno bruno = new Aluno("Bruno",123,98.3);
        Aluno pedro = new Aluno("Pedro", 124, 99.5);
        
        bruno.setNome("Bruno dos Reis Leal");
        bruno.setNotaFinal(50.6);
        
        pedro.setNome("Pedro Albert da Silva");
        pedro.setNotaFinal(98.1);

        bruno.exibirInfo();
        pedro.exibirInfo();

        // exercicio 3

        ContaCorrente conta1 = new ContaCorrente("jose", 5000, 800.0);
       
        conta1.depositar(1100);
        conta1.sacar(950);
        conta1.sacar(500);

        conta1.exibirSaldo();

        // exe 4

        ProdutoEletronico microondas = new ProdutoEletronico("Microondas", 400, 12);

        microondas.aplicarDesconto(15);

        microondas.exibirInfo();

 
}
