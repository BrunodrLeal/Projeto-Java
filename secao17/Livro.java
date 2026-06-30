package secao17;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;
    //fallback
    public Livro() {
        this.titulo = "Título teste";
        this.autor = "Autor";
        this.preco = 16.99;
   }
   //override
   // Basicamente substui um método por outro e os dois funcionam

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("titulo: "+ titulo + ", Autor: " + " autor " + ", Preço " + preco);
    }
}
