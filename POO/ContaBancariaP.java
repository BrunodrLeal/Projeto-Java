package POO;

public class ContaBancariaP {
    
    private String usuario;
    private int conta;
    private static int contadorContas;
    private double saldo;
    private double transferencia;

    public void setUsuario(String usuario){
        
        if(usuario != null && !usuario.isEmpty() && usuario.length() > 3){
        this.usuario = usuario;
        System.out.println("Usuario cadastrado: " + usuario);
        
        } else {
            System.out.println("Usuário inválido");
        }
    }
    public void setConta(){

        this.conta = contadorContas;
        contadorContas++;
        System.out.println("Antes: " + contadorContas);

        this.conta = contadorContas;

        contadorContas++;

        System.out.println("Depois: " + contadorContas);
    }
    public void setSaldo(double saldo){
        if(saldo > 0 && saldo < 1000000){

            this.saldo = saldo;
        }
    }

    public void setTransferencia(double transferencia){
        this.transferencia = transferencia;

    }

    public String getUsuario(){
        return usuario;
    }
    public int getConta(){
        return conta;
    }
    public double getSaldo(){

        return saldo;
    }
    
    public double getTransgerencia(){
        return transferencia;
    }

}
