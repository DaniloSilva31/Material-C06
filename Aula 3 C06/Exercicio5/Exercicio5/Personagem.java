package Exercicio5;

public class Personagem {

    String nome;
    Arma arma;
    int vida;

    void usarArma(){
        arma.resistencia -=2;
    }

    void tomarDano(){
        vida -=5;
    }

}
