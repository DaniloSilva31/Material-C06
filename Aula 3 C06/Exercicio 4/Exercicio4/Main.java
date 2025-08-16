package Exercicio4;

public class Main {

    public static void main(String[] args) {

        Zumbi zumbi1 = new Zumbi();
        Zumbi zumbi2 = new Zumbi();

        zumbi1.nome = "Robervaldo";
        zumbi1.vida = 20;

        zumbi2.nome = "Jubscleyson";
        zumbi2.vida = 150;

        zumbi1.tranferVida(zumbi2, 20);

        System.out.println("A vida do zumbi "+zumbi1.nome+ " é "+ zumbi1.mostrarVida());
        System.out.println("A vida do zumbi "+zumbi2.nome+ " é "+ zumbi2.mostrarVida());
    }

}
