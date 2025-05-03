package academy.devdojo.maratonajava.poo.Hassociacao.exercicio;

public class Seminario {
    private String titulo;
    private String local;
    private Aluno[] alunos;

    public Seminario(String titulo, String local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, String local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void exibirSeminario(){
        System.out.println(titulo);
        if (alunos == null) return;
        System.out.println("Membros: ");
        for (Aluno aluno : alunos){
            System.out.println(aluno.getNome() + " ");
        }
    }




    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return titulo + " (Local: " + local + ")";
    }
}
