package SRC.exercicio;

public class Celular {
    
    String marca;
    String modelo;
    int bateria = 100;
    

    void ligar(){
        System.out.println("O celuluar " + modelo + " esta ligado. ");
        
    }
    void desligar(){
        System.out.println("O Celular " + modelo + " está desligado. ");
    }

    void usar(int consumo){
        if(bateria - consumo >= 0){
            bateria -= consumo;
            System.out.println("Nível da bateria: " + bateria + "%. ");
        } else {
            System.out.println("Bateria insuficiente");
        }
    }
}
