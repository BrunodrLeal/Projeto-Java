package secao20;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    // OverRide -  Sobreescrita.
    // Não é uma boa pratica fazer um OverRide. 

    @Override
    public String toString() {
        return "Nome" + nome + ", idade: " + idade;
    }
}
