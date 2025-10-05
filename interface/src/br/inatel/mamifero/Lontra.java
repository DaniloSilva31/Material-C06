package br.inatel.mamifero;

public class Lontra extends Mamifero implements Aquatico {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Assobiou");
    }

    @Override
    public void nadar() {
        System.out.println("Lontra nadou");
    }
}