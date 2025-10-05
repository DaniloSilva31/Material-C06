import br.inatel.mamifero.boi;
import br.inatel.mamifero.Cachorro;
import br.inatel.mamifero.Lontra;
import br.inatel.mamifero.Mamifero;

public class Main {

    public static void main(String[] args) {

        Mamifero boi = new boi("vaquinha", 100);
        Lontra lontra = new Lontra("lontrinha",100);
        Mamifero cachorro = new Cachorro("doguinho", 100);

        boi.mostraInfo();
        boi.emitirSom();
        lontra.mostraInfo();
        lontra.emitirSom();
        lontra.nadar(); // Duvida!!
        cachorro.mostraInfo();
        cachorro.emitirSom();
    }
}