package Exercicios.testeCalculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("quanto você pesa?");
        double peso = scanner.nextDouble();

        System.out.println("Qual a  sua altura?");
        double altura = scanner.nextDouble();

        altura = altura * 2;
        double imc = peso / altura;
        System.out.println(imc);
        if ( imc < 18){
            System.out.println("abaixo do peso");
        } 
        else if (imc >= 18 && imc <=24.9){
            System.out.println("peso normal");
        } 
        else if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Obesidade");
        }
        scanner.close();
    }
}