package Exercicio6;

public class Main {
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        Piloto p2 = new Piloto();

        p1.nome= "Bortolouco";
        p2.nome= "Drugo";

        Kart k1 = new Kart();
        Kart k2 = new Kart();

        k1.nome = "Kick Sauber";
        k2.nome = "Aston Martin";

        k1.piloto = p1;
        k2.piloto = p2;

        k1.motor.cilindradas="150";
        k2.motor.cilindradas="100";

        k1.motor.velocidadeMaxima=125;
        k2.motor.velocidadeMaxima=120;

        k1.pular();
        k2.pular();

        k1.fazerDrift();
        k2.fazerDrift();

        k1.soltarTurbo();
        k2.soltarTurbo();


        p1.soltaSuperPoder();
        p2.soltaSuperPoder();

        k1.motor.mostraInfo();
        k2.motor.mostraInfo();







    }


}
