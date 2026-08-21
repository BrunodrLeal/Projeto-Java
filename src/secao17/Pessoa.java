package secao17;

public class Pessoa{
    // propriedades privadas.
    private String nome;
    private int idade;

    public void setNome(String nome){ //set para alterar.
        this.nome = nome;
        // o this faz com que a referencia ao proprio objeto.
        // this = este objeto.
    }
    public String getNome() { // get para pegar.
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }
}
