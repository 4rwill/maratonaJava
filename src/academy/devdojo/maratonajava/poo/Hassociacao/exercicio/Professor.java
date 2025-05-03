package academy.devdojo.maratonajava.poo.Hassociacao.exercicio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }


    public void imprime(){
        System.out.println();
        System.out.println("Professor: " + this.nome + ", Especialista em " + this.especialidade);
        if (this.seminarios == null) {
            System.out.println("Sem seminários cadastrados");

            return;
        }
        System.out.println("### Seminários Cadastrados ###");
        for (Seminario seminario : seminarios){
            System.out.println("-"+seminario.getTitulo() + " (Local: "+seminario.getLocal()+")");

            if (seminario.getAlunos() == null){
                System.out.println("    Sem alunos cadastrados");
                continue;
            }
            int totalAlunos = 0;
            for (Aluno aluno: seminario. getAlunos()) totalAlunos++;
            System.out.println("     -Alunos Cadastrados "+ totalAlunos + "/50 : ");
            int quantidadeAlunos = 1;
            for (Aluno aluno: seminario.getAlunos()){
                System.out.println("       " +quantidadeAlunos +  "-"+aluno.getNome() + " ("+aluno.getIdade()+" Anos)");
                quantidadeAlunos++;
            }
        }
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

}
