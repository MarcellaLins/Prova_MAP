import Strategy.*;

import java.util.ArrayList;
import java.util.Collections;

public class Sorteador {
    private static ArrayList<Carta> cartas;

    public Sorteador() {
        cartas = new ArrayList<>();

        cartas.add(new Monstro());
        cartas.add(new Maldicao());
        cartas.add(new Raca());
        cartas.add(new Classe());
    }

    public static Carta sortear() {
        Collections.shuffle(cartas);
        return cartas.getFirst();
    }
}