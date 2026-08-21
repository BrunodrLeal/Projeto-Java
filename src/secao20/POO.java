package secao20;
public class POO {
    public static void main(String[] args) {
        
        // 1 object Composition
        Motor motor1 = new Motor("V8",450);

        Carro carro1 = new Carro("Ford", " Mustang", motor1);

        carro1.exibirInfo();

        // 2 - herança

        Cachorro alice = new Cachorro("Alice");

        alice.miar();

        alice.emitirSom();

        // 3 - Classe Objeto.

        Pessoa matheus = new Pessoa("Matheus ", 33);
        
        Pessoa pedro = new Pessoa("Pedro", 20);
        
        System.out.println(matheus.toString());
        
        System.out.println(matheus.equals(pedro));

        System.out.println(matheus.hashCode());// hash Code tem um id para o objeto. 
        
        // 4 - Override
      

        Quadrado q1 = new Quadrado(4);
        Circulo c1  = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        

        // 5 = Super
        Funcionario funcionario = new Funcionario("Carlos", 3000);
        
        Gerente gerente =new Gerente("Marcos", 5000, 1000);

        funcionario.exibirDetalhes();

        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());

        System.out.println(gerente.calcularBonus());

        // 6 - class abstraction

        InstrumentoMusical violao = new Violao("Violão");
        InstrumentoMusical bateria = new Bateria("Bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();
        
        violao.tocar();
        bateria.tocar();

        // 7 - interfaces.

        Pagamento cartao = new CartaoCredito();
        Pagamento transf = new Transferenciabancaria();

        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

        transf.processarPagamento(250);
        transf.exibirRecibo(250);

        // 8 - multriplas interfaces

        Documento doc = new Documento("Arquivo de texto");

        doc.salvar();

        doc.imprimir();

        doc.instrucaoParaSalvar();

        // 9 - default mehods nas interface;

        CalculadoraAvancada calc = new CalculadoraAvancada();

        System.out.println(calc.somar(2,9));
        System.out.println(calc.multplicar(5,9));

        // 10 polimorfismo.

        // Classes abstradas ou interfaces - > sobresscrever os métodos destas superclasses.
        InstrumentoMusical violino =  new Violino("Violino");

        violino.exibirDetalhes();

        violino.tocar();
     }
}
