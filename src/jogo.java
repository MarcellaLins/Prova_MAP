import Strategy.*;

public class jogo {
    private Sorteador sorteador;
    private Carta comportamento;

    public jogo() {
        sorteador = new Sorteador();
    }

    // set strategy
    public void chutarPorta() {
        comportamento = sorteador.sortear();
        comportamento.classificar();
    }
}