package secao17;


public class ContaBancaria{

    private String titular;
    private double saldo;

    public void settitular(String titular){
        // logica para validação ou manipulação
        if(titular != null && !titular.isEmpty()) {
            this.titular = titular;
        }else{
            System.out.println("nome do titular inválido");
        }
    }

    public void setSaldo(double saldo){
        if(saldo >= 0) {
            this.saldo = saldo;
        }else{
            System.out.println("O valor precisa ser positivo.");
        }
    }
    public void ExibirConta(){
        System.out.println("Nome da titular é: " + titular + "O saldo de Ana é: R$" + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public String getSaldo() {
        return "R$" + saldo;
    }
}