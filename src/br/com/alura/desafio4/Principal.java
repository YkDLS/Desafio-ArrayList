package br.com.alura.desafio4;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Double custoTotal = 0.0;
        Double mediaPreco = 0.0;
        Produto produto1 = new Produto("Camisa de Botão", 12);
        Produto produto2 = new Produto("Bermuda Camuflada", 112);
        Produto produto3 = new Produto("Cueca Supreme", 54);
        Produto produto4 = new Produto("New Balance 1000", 999);
        ArrayList<Produto> listaProduto = new ArrayList<>();

        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        listaProduto.add(produto4);


        System.out.println(listaProduto.size());

        for (Produto item : listaProduto ){
            custoTotal += item.getPreco();
        }

        mediaPreco = custoTotal / listaProduto.size();

        System.out.println("Preço médio dos produtos: " + mediaPreco);






    }

}
