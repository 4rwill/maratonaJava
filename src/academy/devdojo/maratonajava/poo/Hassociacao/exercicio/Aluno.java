package academy.devdojo.maratonajava.poo.Hassociacao.exercicio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void exibirAluno(){
        System.out.println( "Aluno:" + nome + " " + idade + " | " + "Seminário: " + seminario.toString());
    }



    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }
    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

}
