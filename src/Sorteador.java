import java.util.ArrayList;
import java.util.Collections;

public class Sorteador {
    public static Cartas sortear() {
        ArrayList<Cartas> cartas = new ArrayList<>();

        cartas.add(Cartas.MONSTRO);
        cartas.add(Cartas.MALDICAO);
        cartas.add(Cartas.RACA);
        cartas.add(Cartas.CLASSE);

        Collections.shuffle(cartas);
        return cartas.getFirst();
    }
}
