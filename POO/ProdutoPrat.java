package POO;

public class ProdutoPrat {
    
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome){
        if(nome != null && !nome.isEmpty() && nome.length() > 3){
            this.nome = nome;
        } else {
            System.out.println("Nome invalido");
        }
    }
    public void setPreco(double preco){
        if(preco >= 0){
            this.preco = preco;
        } else{
            System.out.println("O preço está negativo, não permitido!!!");

        }
    }
    public void setQuantidade(int quantidade){
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else {
            System.out.println("Quantidade negativa, não permitido.");
        }
    }    
    public String ExibirInfo(){
        
        return String.format("Nome: %s%nPreço: R$%.2f%nQuanidade: %d ",
        nome, preco, quantidade
        ); 
    }   
    

}
