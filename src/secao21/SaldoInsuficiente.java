package secao21;

// Toda Classe que esda de exception, tem que enviar pelo menos a mensagem.
// getMessage -> mensagem

public class SaldoInsuficiente extends Exception {
    public  SaldoInsuficiente(String mensagem){
        super(mensagem);
    }
}
