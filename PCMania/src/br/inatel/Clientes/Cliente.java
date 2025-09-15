package br.inatel.Clientes;

import br.inatel.Computadores.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[1000];

    public void setComputadores(Computador computador) {
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] == null) {
                computadores[i] = computador;
                break;
            }
        }
    } // setter para associar o pc e o cliente

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }// construtor do cliente

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i] != null)
                total += computadores[i].getPreco();
        }
        return total;
    }// Calculando o valor da compra total, caso a casa não seja null

    public Computador[] getComputadores() {
        return computadores;
    }

    public String getNomecpf() {
        return nome + " " + cpf;

    }// return cpf e nome do cliente

}


