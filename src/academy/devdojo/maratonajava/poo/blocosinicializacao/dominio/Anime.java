package academy.devdojo.maratonajava.poo.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do Bloco");
        episodios = new int[30];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {


        for (int episodio:this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println( );
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
