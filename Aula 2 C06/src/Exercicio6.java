import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Random rand = new Random();
        int x = rand.nextInt(10)+1;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número para adivinhar: ");

        int n = entrada.nextInt();

        while(n != x)
        {
            if(x > n)
                System.out.println("Meu número é maior");
            else
                System.out.println("Meu número é menor");
            System.out.println("Tente novamente:");
            n = entrada.nextInt();
        }

        System.out.println("Você acertou, parabéns");

        entrada.close();

    }
}