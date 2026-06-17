import Strategy.*;

public class jogo {

        public static void chutarPorta() {
            Sorteador sorteador = new Sorteador();
            Carta cartaSorteada = sorteador.sortear();

            cartaSorteada.classificar();
        }
}
