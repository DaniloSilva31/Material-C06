package br.inatel.mamifero;

public class boi extends Mamifero {

    public boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Mugiu ");
    }
}