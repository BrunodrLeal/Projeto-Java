package ExePoo;

public class LivroBiblioteca {
    
    private String nome;
    private String autor;
    private boolean disponivel;

    public void Emprestado(boolean disponivel){
        if(disponivel == true){
            System.out.println("Livro pode ser empresato");
        } else {
            System.out.println("Livro ocupado!");
        }
    }


}
