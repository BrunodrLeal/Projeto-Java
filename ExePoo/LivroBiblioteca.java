package ExePoo;

public class LivroBiblioteca {
    
    private String titulo;
    private String autor;
    private boolean disponivel;

    public void LivroBiblioteca(String titulo, String autor,boolean disponivel){
        this.titulo = "Harry Potter e a camera secreta";
        this.autor =  "J K Rowlling";
        
    }
    public void setDisponivel(){
        if(disponivel == false){
            System.out.println("Livro pode ser empresato!");
        } else  {
            System.out.println("Livro devolvido!");
        
        }
    }
    
    public void setOcupado(){
       if(disponivel == true){
            System.out.println("Livro devolvido!");
        } else {
            System.out.println("Livro pode ser emprestado!");
        } 
            
    }
    

}
