package br.inatel.mamifero;

public class Cachorro extends Mamífero {

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latiu");
    }
}
