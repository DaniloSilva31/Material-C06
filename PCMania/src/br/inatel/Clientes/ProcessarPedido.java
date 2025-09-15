package br.inatel.Clientes;

import br.inatel.Computadores.Computador;

public class ProcessarPedido {
    private static String pedidoEnviado(){
        return "Pedido enviado...";
    }// metodo privado para usar apenas na classe, a fim de mostrar que o pedido foi enviado para a loja (helper)
    Computador computador;
    public String PCscomprados(Computador computadores){
        return pedidoEnviado();
    }//metodo para usar o metodo privado da classe
    public ProcessarPedido(Computador computadores){
        this.computador= computadores;
    }// construtor do processar pedido
}
