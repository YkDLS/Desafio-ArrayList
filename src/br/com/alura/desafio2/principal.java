package br.com.alura.desafio2;

public class principal {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Cachorro cachorro1 = new Cachorro();

        Animal cachorrinho = cachorro1;

       // if (cachorrinho instanceof Cachorro cachorro){
           // System.out.println("Tipo certo");
        //}
        if (animal1 instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal1;
        }else System.out.println("Não é cachorro");
    }
}
