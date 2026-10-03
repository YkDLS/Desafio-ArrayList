package br.com.alura.desafio5;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Quadrado quadrado = new Quadrado(1.70,1.40);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();

        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas){
            System.out.println(forma.calcularArea());
        }
    }
}
