import Strategy.*;

public class jogo {

        public static void chutarPorta() {
            Sorteador sorteador = new Sorteador();
            Cartas cartaSorteada = sorteador.sortear();

            switch (cartaSorteada) {
                case MONSTRO:
                    System.out.println("Carta sorteada: MONSTRO");
                    Monstro monstro = new Monstro();
                    monstro.classificar();
                    break;
                case MALDICAO:
                    System.out.println("Carta sorteada: MALDIÇÃO");
                    Maldicao maldicao = new Maldicao();
                    maldicao.classificar();
                    break;
                case RACA:
                    System.out.println("Carta sorteada: RAÇA");
                    Raca raca = new Raca();
                    raca.classificar();
                    break;
                case CLASSE:
                    System.out.println("Carta sorteada: CLASSE");
                    Classe classe = new Classe();
                    classe.classificar();
                    break;
            }
        }


}
