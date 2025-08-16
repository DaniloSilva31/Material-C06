package Exercicio4;

public class Zumbi {
    String nome;
    double vida;

    boolean tranferVida(Zumbi zumbiAlvo, double quantia){

        if(quantia<=vida) {
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            System.out.println("O zumbi " + nome + " tranferiu " + quantia + " de vida para " + zumbiAlvo.nome);
            return true;
        }
        else{
            System.out.println("A tranferência não deu certo pois a vida do zumbi "+nome+" é " +vida);
            return false;
        }
    }
    double mostrarVida(){
        return vida;
    }
}
