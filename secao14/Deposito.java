package secao14;

import java.util.List;
import java.util.ArrayList;

public class Deposito{
    double valor;
    int contaDestino;
    String data;
    String hora;
    String descricao;

    public Deposito(double valor, int contaDestino, String data, String hora, String descricao){
        this.valor = valor;
        this.contaDestino = contaDestino;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public void infoDep() {
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("Conta Destino: " + contaDestino);
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Descrição: " + descricao);
        System.out.println("-----------------------------");
    }

}