package academy.devdojo.maratonajava.poo.Hassociacao.test;

import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Gotze");
        Time time = new Time("Bayern");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
