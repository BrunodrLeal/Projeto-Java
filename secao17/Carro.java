package secao17;

public class Carro{
    // atributos ou propriedades
    String marca;
    String modelo;
    int ano; // 2010

    double velocidadeAtual = 0;
    boolean motorLigado = false;
    // métodos
    void acelerar(){
        System.out.println("Estamos acelerando o carro! ");
    }
    void exibirInfo() {
        System.out.println("Marca: " + marca+" , modelo: "+ modelo + ", ano:"+ ano);

    }

    void ligarMotor(){
        
        if(!motorLigado){

            motorLigado = true;
            System.out.println("Ligando motor...");
        }  else{
            System.out.println("o motor já está ligado!");
        }
    }

    void aumentarVelocidade(double incremento) {
        if (motorLigado){
            velocidadeAtual += incremento;
            System.out.println("A velocidade atualé: " + velocidadeAtual);
        } else {
            System.out.println("primeiro precisa ligar o motor.");
        }
    }
}