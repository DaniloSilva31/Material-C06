package Exercicio5;

public class Main {
    public static void main(String[] args) {

        Personagem guerreiro = new Personagem();
        Arma a1 = new Arma();

        a1.nome = "Ariéte";
        a1.poder = 50;
        a1.resistencia = 15;
        a1.descricao = "recebe escudo ao quebrar os escudos do inimigo";

        guerreiro.nome ="Peresvaldir";
        guerreiro.arma = a1;
        guerreiro.vida = 100;

        System.out.println("Vida do guerreiro "+guerreiro.nome+ " é "+guerreiro.vida);

        a1.mostraInfoArma();

        guerreiro.usarArma();

        a1.mostraInfoArma();

        guerreiro.tomarDano();

        System.out.println("Vida do guerreiro "+guerreiro.nome+ " é "+guerreiro.vida);


    }
}
