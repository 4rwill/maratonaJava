package academy.devdojo.maratonajava.poo.Bmetodos.sobrecarga.test;

import academy.devdojo.maratonajava.poo.Bmetodos.sobrecarga.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Inazuma Eleven", "Mangá", 100, "Esporte");
        anime.imprime();
    }
}
