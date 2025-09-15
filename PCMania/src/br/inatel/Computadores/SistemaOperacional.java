package br.inatel.Computadores;

public class SistemaOperacional {

    private String nome;  // tipo:macOS Sequoia
    private int tipo; // 64 bits ...

    public SistemaOperacional(String nome, int tipo){
        this.nome = nome;
        this.tipo = tipo;
    }// construtor do sistema operacional

    public String getNome() {
        return nome;
    }// return o nome do sistema operacional
}
    public int getTipo() {
        return tipo;
    }//return do tipo do sistema
