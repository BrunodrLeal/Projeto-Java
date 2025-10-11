package sessao8;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Conversor de temperatura=====");
        System.out.println("        temos duas opções...      ");
        System.out.println("(1) Celsius para Fahrenheit" );
        System.out.println("(2) Fahrenheit para Celsius" );
        int temp = scanner.nextInt();
        if(temp == 1){
            celcius();
        } else if (temp == 2){
            fahrenheit();
        }else {
            System.out.println("Opção inválida");
        }
        scanner.close();
    }
    public static void fahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura atual");
            Double fahrenheit = scanner.nextDouble();
            Double resul1 = (fahrenheit -32) * 5 / 9;
        System.out.println("De " + fahrenheit+ " F para " + resul1 + " C! ");
        scanner.close();
    }
    public static void celcius (){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a temperatura atual");
            Double celcius = scanner.nextDouble();
            Double resul2 = (celcius * 1.8) + 32;
        System.out.println("De " + celcius + " C para " + resul2 + " F! ");
        scanner.close();
}

}
