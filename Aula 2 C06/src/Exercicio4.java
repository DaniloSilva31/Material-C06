import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos alunos possui ?");
        int numAlunos= entrada.nextInt();

        switch (numAlunos)
        {
            case 10:
            case 20:
                System.out.println("Ir para a sala I-16");
                break;
            case 30:
                System.out.println("Ir para a sala I-22");
                break;
            default:
                System.out.println("Número de alunos inválidos");
        }
            entrada.close();
    }
}
