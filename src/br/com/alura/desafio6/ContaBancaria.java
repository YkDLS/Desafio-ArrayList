package br.com.alura.desafio6;

public class ContaBancaria {

    private int numConta;
    private double saldo;

    public ContaBancaria(int numConta, double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
