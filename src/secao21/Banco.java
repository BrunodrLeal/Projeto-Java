package secao21;

public class Banco {
    
    private double saldo;

    public Banco(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws SaldoInsuficiente {
        if(valor > saldo) { 
            // exception
            throw new SaldoInsuficiente("Saldo insuficiente para sacar: "+ valor);
            
        }
        saldo -= valor;

        System.out.println("Saque realziado com sucesso, de :" + valor);
    }


}
