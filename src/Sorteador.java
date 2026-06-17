import java.util.ArrayList;
import java.util.Collections;

public class Sorteador {
    private static ArrayList<Cartas> cartas;

    public Sorteador() {
        cartas = new ArrayList<>();

        cartas.add(Cartas.MONSTRO);
        cartas.add(Cartas.MALDICAO);
        cartas.add(Cartas.RACA);
        cartas.add(Cartas.CLASSE);
    }

    public static Cartas sortear() {
        Collections.shuffle(cartas);
        return cartas.getFirst();
    }
}