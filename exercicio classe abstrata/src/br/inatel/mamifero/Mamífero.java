package br.inatel.mamifero;

public abstract class Mamífero {

    protected String nome;
    protected double vida;

    public Mamífero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("O mamífero "+ nome + " possui "+vida+" de vida");
    }
}
