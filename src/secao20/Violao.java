package secao20;

public class Violao extends  InstrumentoMusical{
    
    public Violao (String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando as cordas do " + nome);
    }
}
