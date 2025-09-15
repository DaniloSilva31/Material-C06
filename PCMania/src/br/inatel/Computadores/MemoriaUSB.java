package br.inatel.Computadores;

public class MemoriaUSB {
    private String nome; // nome da memoria
    private int capacidade; // 16GB, 32GB ou 1TB

    public MemoriaUSB(String nome,int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }//construtor da memoria USB

    public String getNome() {
        return nome;
    }//return do nome da memoria
}
    public int getCapacidade() {
        return capacidade;
    }//return a capacidade da memória 