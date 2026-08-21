package secao20;

public class Cachorro extends Animal {
    // extends é a chave para a Herança. nesse caso herdando as propriedades de Animal
    // é obrigado a usar as propriedades da classe pai =  super.

    public Cachorro(String nome) {
        super(nome);
    }

    public void miar(){
        System.out.println(nome + " esta miando! ");
    }

}
