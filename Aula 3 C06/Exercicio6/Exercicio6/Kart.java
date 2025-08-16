package Exercicio6;

public class Kart {
    String nome;
    Piloto piloto;
    Motor motor;

    public Kart(){
        motor = new Motor();
    }

    void pular(){

        System.out.println("O kart da "+nome+" pulou");
    }

    void soltarTurbo(){

        System.out.println("O kart da "+nome + " soltou turbo");
    }
    void fazerDrift(){
        System.out.println("O kart da "+nome+" fez um drift bonito e carregou seu turbo");
    }
}
