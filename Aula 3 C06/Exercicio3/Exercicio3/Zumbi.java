package Exercicio3;

public class Zumbi {
    String nome;
    double vida;

    void tranferVida(Zumbi zumbiAlvo, double quantia){
        vida -=quantia;

        zumbiAlvo.vida += quantia;

        System.out.println("O zumbi "+nome + " tranferiu "+quantia + " de vida para "+zumbiAlvo.nome);
    }
    double mostrarVida(){
        return vida;
    }
}
