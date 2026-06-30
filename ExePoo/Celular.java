package ExePoo;

public class Celular{
    String marca;
    String modelo;
    int bateria = 100;

    void Ligar(){
        System.out.println("O celular "+ modelo + " está ligado");
    }
    void Desligar(){
        System.out.println("");
    }
    void Usar(int consumo){
        if(bateria - consumo >=0 ){
            bateria -= consumo;
            System.out.println("O celular foi usado. A bateria está em: "+ bateria +"%");
        } else{
            System.out.println("O " + modelo + " não tem bateria suficiente.");
        }
    }
    public static void main(String[] args) {
        
    }
}
