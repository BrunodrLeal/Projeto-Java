package secao17;

public class POO {
  
public static void main(String[] args) {
      
    // 1 - criar classe
    // criação de Carro.java
    
    // 2 - Instanciar a classe
    Carro fusca = new Carro();

    fusca.marca = "VW";
    fusca.modelo = "fusca";
    fusca.ano = 1954;

    fusca.modelo = "ferrari";
    fusca.acelerar();
    fusca.exibirInfo();

    Carro fiesta = new Carro();

    fiesta.marca ="Ford";
    fiesta.modelo = "Fiesta";
    fiesta.ano = 2015;
    
    fiesta.exibirInfo();

    System.out.println(fusca == fiesta);

    // 3 - métodos

    fiesta.ligarMotor();

    fiesta.aumentarVelocidade(30.0);
    fiesta.aumentarVelocidade(50.3);

    // 4 - Criando Propriedades.

    Pessoa joao = new Pessoa();
    joao.setNome("joão");

    System.out.println("O nome do João é: "+ joao.getNome());

    joao.setIdade(39);

    System.out.println("O João tem a idade de : " + joao.getIdade());
}
    
}
