package exercicio;

class ProdutoEletronico {
    private String nome;
    private double preco;
    private int garantia;

    public ProdutoEletronico(String nome, double preco, int garantia){
        this.nome = nome;
        this.preco = preco;
        this.garantia = garantia;
    }
     
    void desconto(double porcentagem){
        if(porcentagem > 0 && porcentagem <= 50){
            double valorDesconto = calcularDesconto(porcentagem);

           preco -= valorDesconto;
        } else {
            System.out.println("não é possível dar o desconto.");
        }
    }
    public double calcularDesconto(double porcentagem){
       return (preco * porcentagem) / 100;
    }

    public void exibirInfo() {
        System.out.println("Produto: " + nome + ". Preço de: R$" + preco + ", e tem " + garantia + " meses de garantia.");
    }

}