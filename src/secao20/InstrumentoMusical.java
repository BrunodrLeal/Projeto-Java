package secao20;

// não tem herança
abstract  class InstrumentoMusical {
    
    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    // tem que ser implementado na subclasses

    public abstract  void tocar();

    // concreto: pode ser herdado.

    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }
}
