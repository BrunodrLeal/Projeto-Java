package secao14;


public class Cliente {
    
    public int getNumeroConta() { 
        return numeroConta; }

    public double getSaldo() { 
        return saldo; }

    public void setSaldo(double saldo) {
        this.saldo = saldo; }

    String nome;
    String telefone;
    String email;
    String rua;
    int numeroCasa; 
    String bairro;
    String cidade;
    String estado;
    int numeroConta;
    double saldo = 0.0;

    public Cliente(String nome, String telefone, String email,String rua,int numeroCasa,String bairro, String cidade, String estado, int numeroConta, Double saldo) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.rua = rua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numeroConta = numeroConta;
        this.saldo = saldo;

    }

    // Método para mostrar os dados formatados
    public void exibirInfo() {
        System.out.println("-----------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Endereço: " + rua + ", " + numeroCasa + ", " + bairro + ", " + cidade + ", " + estado);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
        System.out.println("-----------------------------");
    }
}
