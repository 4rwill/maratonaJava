package academy.devdojo.maratonajava.poo.Hassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime() {
        System.out.println("Nome do jogador: " + this.nome);
        if (time != null) {
            System.out.println("Time do jogador: " + time.getNome());
        }
        System.out.println();
    }

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
