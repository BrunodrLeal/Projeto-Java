package secao20.Exercicios;

public class POO {
    public static void main(String[] args) {
    
    Endereco endereco1 = new Endereco("Rua dos Bandeirantes", 291, "Arcos");

    Pessoa pessoa1 = new Pessoa("Bruno dos Reis Leal",   35 , endereco1);
    pessoa1.exibirInfo();

    // Exercicio 2

    Veiculo veiculo = new Veiculo();
    veiculo.acelerar();
    
    Carro carro = new Carro();
    carro.acelerar();

    Moto moto = new Moto();
    moto.acelerar();

    // Exercício 3

    Cachorro cachorro = new Cachorro("LULU", "AUAU", "LULU da Bumerangue");

    cachorro.exibirDetalhes();
    
    // exercicio 4

    FuncionarioTempoIntegral fti = new FuncionarioTempoIntegral("Ana", 4000);
    FuncionarioMeioPeriodo fmp = new FuncionarioMeioPeriodo("Pedro", 50, 120);

    System.out.println("Salario Ana " + fti.calcularSalario());
    System.out.println("Salário Pedro " + fmp.calcularSalario());

        fti.adicionarBeneficio("Plano de saúde e VA");
        fmp.adicionarBeneficio("Va");
        
     // Exercício 5
        Pilotavel meuHidroAviao = new Hidroaviao();
        
        Navegavel meuBarco = new Barco();
        Pilotavel meuAviao = new Aviao();

        meuAviao.pilotar();

        meuHidroAviao.pilotar();// da o mesmo erro

        meuBarco.navegar();

        operarVeiculo(meuAviao);
        operarVeiculo(meuHidroAviao);
        operarVeiculo(meuBarco);

    }

    public static void operarVeiculo(Object veiculo) {

        if(veiculo instanceof Pilotavel) {
            System.out.println("Este veículo é pilotável");
        }

        if(veiculo instanceof Navegavel) {
            System.out.println("Este veículo é navegável");
        }

    }
    
}
