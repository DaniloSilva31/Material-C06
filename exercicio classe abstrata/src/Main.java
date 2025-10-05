import br.inatel.mamifero.Boi;
import br.inatel.mamifero.Cachorro;
import br.inatel.mamifero.Lontra;
import br.inatel.mamifero.Mamífero;

public class Main {

    public static void main(String[] args) {

        Mamífero boi = new Boi("vaquinha", 100);
        Mamífero lontra = new Lontra("lontrinha",100);
        Mamífero cachorro = new Cachorro("doguinho", 100);

        boi.mostraInfo();
        boi.emitirSom();
        lontra.mostraInfo();
        lontra.emitirSom();
        cachorro.mostraInfo();
        cachorro.emitirSom();
    }
}
