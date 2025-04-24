package academy.devdojo.maratonajava.poo.Gestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0- Bloco de inicialização é executado quando a JVM carregar classe
    // 1- Alocado espaco em memória pro objeto
    // 2- Cada atributo de classe é criado e inicializado com valores default ou o quer for definido
    // 3- Bloco de inicialização é executado
    // 4- Construtor é executado
    // obs: com o uso do static na criação de um bloco de inicialização, o bloco só é executado uma vez

    static {
        System.out.println("Dentro do Bloco 1");
        episodios = new int[30];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do Bloco 2");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {


        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
