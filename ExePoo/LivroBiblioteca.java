package ExePoo;

public class LivroBiblioteca {
    
    private String titulo = "Harry Potter e a camera secreta.";
    private String autor = "J K Rownling";
    private boolean disponivel = true;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public boolean  getDisponivel(){
        return disponivel; 
    }
    public void emprestar(){
        if(getDisponivel()){
            System.out.println("Livro emprestado pra você "+ titulo + ", Autor: "+ autor);
            setDisponivel(false);
        } else {
            System.out.println("Livro já está emprestado.");
        }
    }
    public void devolver(){
        if(!getDisponivel()){
            System.out.println("Livro devolvido "+ titulo + ", Autor: "+ autor);
            setDisponivel(true);
        } else {
            System.out.println("O livro já está disponível.");
        }
    }
       
}
