package br.inatel.Computadores;

public class Computador {
    private String marca;
    private float preco;
    private HardwareBásico[] Hardware;
    private SistemaOperacional sistemaOperacional;
    private MemoriaUSB memoria;
    // atributos privados
    public Computador(String marca, float preco, SistemaOperacional sistemaOperacional, HardwareBásico hardware[]) {
        this.sistemaOperacional = sistemaOperacional;
        this.marca = marca;
        this.preco = preco ;
        this.Hardware = hardware;
    }//Construtor do computador

    public void addMemoriaUSB(MemoriaUSB musb){
        this.memoria = musb;
    }// Metodo para adicionar a memoria, pois não é necessário ter agregação

    public void mostraPCConfigs(){
        System.out.println("Marca: "+marca);
        System.out.println("Preço: "+preco);
        System.out.println("Hardwares Básicos:");
        for (int i = 0; i < Hardware.length; i++) {
            System.out.println(Hardware[i].getNome()+" " + "Capacidade: "+Hardware[i].getCapacidade()+ "");
        }
        System.out.println("Sistema Operacional: "+sistemaOperacional.getNome());
        System.out.println("Mémoria externa: "+memoria.getNome());
    }// Mostra as configurações do PC para a promo

    public float getPreco() {
        return preco;
    } // Return o preço de cada Pc

    public String getMarca() {
        return marca;
    } // return o nome da marca do PC

    public String getHardware() {
        String hard="";
        for (int i = 0; i < Hardware.length; i++)
            if (Hardware[i] != null)
                    hard+= Hardware[i].getNome()+ " ";
        return hard;
    }// Vasculhar array para mostrar o nome de cada hardware quando o cliente compra o PC

    public String getSistemaOperacional() {
        return sistemaOperacional.getNome();
    } // return o nome do sistema operacional

    public String getMemoria() {
        return memoria.getNome();
    }// return o nome da mémoria
}
