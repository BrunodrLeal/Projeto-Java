package exercicio;

public class ContaCorrente {

    private String titular;
    private double saldo;
    private double limiteSaque;

    public ContaCorrente(String titular, double saldo, double limiteSaque) {
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public void depositar(double deposito) {
        if (deposito > 0) {
            saldo += deposito;
            System.out.println("Depósito realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void sacar(double saque) {
        if (saque > limiteSaque) {
            System.out.println("Valor excede o limite de saque.");
        } else if (saldo >= saque) {
            saldo -= saque;
            System.out.println("Saque realizado. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}