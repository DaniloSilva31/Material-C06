import java.sql.SQLOutput;
import java.util.NavigableSet;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota da sua NPA: ");
        int NPA = entrada.nextInt();

        if (NPA < 60)
        {
            System.out.print("Você pegou NP3, digite sua nota da NP3: ");
            int NP3 = entrada.nextInt();
            int NFA = (NP3 + NPA)/2;

            if (NFA < 50)
                System.out.println("Reprovou meu fi");
            else
                System.out.println("Passou bem");
        }
        else
            System.out.println("Passou tranquilo!!");

        entrada.close();
    }
}
