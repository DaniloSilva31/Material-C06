package br.inatel.Clientes;

import br.inatel.Computadores.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores = new Computador[1000];


    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }// construtor do cliente

    public void addComputadores(Computador computador){
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] == null){
                computadores[i] = computador;
                break;
            }
        }
    } // Adicionar o pc no array de pcs comprados, caso a casa não seja null


    public float calculaTotalCompra(){
        float total=0;
        for (int i = 0; i < computadores.length; i++) {
            if (computadores[i]!=null)
                total += computadores[i].getPreco();
        }
        return total;
    }// Calculando o valor da compra total, caso a casa não seja null

    public String getNomecpf() {
        return nome + " " + cpf;
    }// return cpf e nome do cliente

    public void escreverPCs(){
        for(int i = 0; i < computadores.length; i++){
            if(computadores[i] != null){
                System.out.println("                                        ");
                System.out.println(computadores[i].getMarca());
                System.out.println(computadores[i].getPreco());
                System.out.println(computadores[i].getHardware());
                System.out.println(computadores[i].getSistemaOperacional());
                System.out.println(computadores[i].getMemoria());
            }
            else{
                break;
            }
        }
    }
} // mostrar o pc que o cliente comprou


