package br.inatel.Computadores;

public class HardwareBásico {
    private String nome;
    private float capacidade;

    public HardwareBásico(String nome, float capacidade) {
        this.nome = nome;
        this.capacidade= capacidade;
    }//construtor do hardware básico

    public String getNome() {
        return this.nome;
    }//return nome do Hardware

    public float getCapacidade() { // !!!!!!!!!!!!!!
        return capacidade;
    }
}
