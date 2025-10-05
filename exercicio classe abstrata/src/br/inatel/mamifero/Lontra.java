package br.inatel.mamifero;

public class Lontra extends Mamífero {

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Assobiou");
    }
}
