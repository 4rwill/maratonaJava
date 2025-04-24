package academy.devdojo.maratonajava.poo.Hassociacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprime() {
        System.out.println("Nome do time: " + this.nome);
        if (jogadores == null) return;
        System.out.print("Jogadores do time: ");
        for (Jogador jogador : jogadores) {
            System.out.print(jogador.getNome() + " ");
        }
        System.out.println();
        System.out.println();
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
