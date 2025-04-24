package academy.devdojo.maratonajava.poo.Hassociacao.test;

import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ney");
        Jogador jogador2 = new Jogador("Alaba");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
            
        }


    }
}
