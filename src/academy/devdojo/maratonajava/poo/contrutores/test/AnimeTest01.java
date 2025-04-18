package academy.devdojo.maratonajava.poo.contrutores.test;

import academy.devdojo.maratonajava.poo.contrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Mangá", 100, "Shounen", "Ghibli");
        anime.imprime();
    }
}
