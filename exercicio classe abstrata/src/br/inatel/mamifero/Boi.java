package br.inatel.mamifero;

public class Boi extends Mamífero {

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Mugiu ");
    }
}
