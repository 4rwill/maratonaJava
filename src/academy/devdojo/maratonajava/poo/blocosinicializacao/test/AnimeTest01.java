package academy.devdojo.maratonajava.poo.blocosinicializacao.test;

import academy.devdojo.maratonajava.poo.blocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Naruto");

        for (int episodio : anime1.getEpisodios()) {
            System.out.print(episodio + " ");

        }


    }
}
