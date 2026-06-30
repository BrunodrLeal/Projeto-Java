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

    // 5 Setters e Getters

    ContaBancaria ContaDaAna = new ContaBancaria();

    ContaDaAna.settitular("Ana");

    ContaDaAna.setSaldo(1000);

    ContaDaAna.ExibirConta();

    // criar um exercício que crie um metodo que exiba os dois dados das classes.
    // consegui realizar o exercício com sucesso. 

        System.out.println(ContaDaAna.getTitular());
    System.out.println(ContaDaAna.getSaldo());

    // 6 -  Logica em get e set.

    //Produto camisa = new //Produto();
    //camisa.setNome("Camisa regata");
    //camisa.setPreco(29.9999999);

    //System.out.println(camisa.getPreco());
    
    // 7 - metodos dentro de método;
    //System.out.println(camisa.getProdutoInfo());

    //camisa.aplicarDesconto(10);

    // 8 construtores

    Livro meuLivro =  new Livro("Harry Potter" ,  "J K Rowlling", 31.90);

    meuLivro.exibirInfo();

    Livro meuLivro2 =  new Livro();

    meuLivro2.exibirInfo();
    
    }
    
    
}
