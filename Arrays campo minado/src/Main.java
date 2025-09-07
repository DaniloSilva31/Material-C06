import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean [][] campoMinado; // campo minado em boolean, 0 ou 1
        campoMinado = new boolean[2][2]; // matriz de duas linhas e duas colunas
        Random rand = new Random(); // número aleátorio
        Scanner entrada = new Scanner(System.in);



        int posicaox = rand.nextInt(2); // qual casa em x esta a bomba, gerada aleatoriamente. 0 a 1
        int posicaoy = rand.nextInt(2); // qual casa em y esta a bomba, gerada aleatoriamente. 0 a 1

        System.out.println("Bomba: "+posicaox + " - " +posicaoy);  // só para mostrar qual casa esta

        campoMinado[posicaox][posicaoy]=true; // casa da bomba colocada como true

        System.out.println("Bem vindo ao campo, se prepare!!");

        int escolhax, escolhay;
        int contador = 0;
        do {
           System.out.print("Digite uma posicao X: ");
            escolhax = entrada.nextInt(); // casa em x que o jogador escolheu

            System.out.print("Digite uma posicao Y: ");
            escolhay = entrada.nextInt(); // casa em y que o jogador escolheu

            if(campoMinado[escolhax][escolhay]){ // se escolheu a casa da mina
                System.out.println("Opa acertou a mina");
                contador = 0; // reseta a contagem
            }else{
                System.out.println("Boa! Sem mina"); // se não escolheu a casa da mina, avança no game
                contador++;
            }


        } while (contador < 2);
        // passou duas vezes pelo campo, ganhou


        System.out.println("Parabens vc venceu o campo!!");



    }

}