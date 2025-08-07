import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        int lanche1;
        int lanche2;
        int lanche3;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Coloque a quantidade do primeiro lanche: ");
        lanche1 = entrada.nextInt();
        System.out.print("Coloque a quantidade do segundo lanche: ");
        lanche2 = entrada.nextInt();
        System.out.print("Coloque a quantidade do terceiro lanche: ");
        lanche3 = entrada.nextInt();

        int total = lanche1 + lanche2 + lanche3;

        double media = (double) (total)/3;

        System.out.println("O total dos lanches foi: "+total);
        System.out.println("A média dos lanches foi: "+media);

        entrada.close();
    }
}
