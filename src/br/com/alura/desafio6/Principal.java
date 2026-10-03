package br.com.alura.desafio6;

import java.util.ArrayList;

public class Principal{

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123, 1000.00);
        ContaBancaria conta2 = new ContaBancaria(456, 1.20);
        ContaBancaria conta3 = new ContaBancaria(789, 2000);

        ArrayList<ContaBancaria> ListaContas = new ArrayList<>();

        ListaContas.add(conta1);
        ListaContas.add(conta2);
        ListaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = ListaContas.get(0);

        for (ContaBancaria conta : ListaContas){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}
