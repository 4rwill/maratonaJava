package academy.devdojo.maratonajava.poo.Hassociacao.test;

import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kaka");
        Jogador jogador2 = new Jogador("Seedorf");
        Jogador jogador3 = new Jogador("Neymar");
        Time time1 = new Time("Milan");
        Time time2 = new Time("Santos");
        Jogador[] jogadores1 = {jogador1, jogador2, jogador3};
        Jogador[] jogadores2 = {jogador3};

        jogador1.setTime(time1);
        jogador2.setTime(time1);
        jogador3.setTime(time2);

        time1.setJogadores(jogadores1);
        time2.setJogadores(jogadores2);

        System.out.println("--- Jogador ---");
        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();

        System.out.println("--- Time ---");
        time1.imprime();
        time2.imprime();
    }


}
