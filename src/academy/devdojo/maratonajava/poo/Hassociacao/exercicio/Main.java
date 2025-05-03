package academy.devdojo.maratonajava.poo.Hassociacao.exercicio;

public class Main {
    public static void main(String[] args) {
        Seminario seminario1 = new Seminario("Ser leão", "Sala 2");
        Seminario seminario2 = new Seminario("Ser leão II", "Sala 1");
        Seminario seminario3 = new Seminario("Aprendiz em Ser leão", "Sala 7");

        Aluno aluno1 = new Aluno("Will", 20,seminario2);
        Aluno aluno2 = new Aluno("Leão 1", 19, seminario1);
        Aluno aluno3 = new Aluno("Leão 2", 20, seminario1);
        Aluno aluno4 = new Aluno("Leão 3", 22, seminario1);
        Aluno aluno5 = new Aluno("Leão 4", 24, seminario1);
        Aluno aluno6 = new Aluno("Leão 5", 55, seminario1);
        Aluno aluno7 = new Aluno("Leão 6", 13, seminario1);

        Aluno[] alunos1 = {aluno2, aluno3,aluno4,aluno5,aluno6,aluno7};
        Aluno[] alunos2 = {aluno1};
        seminario1.setAlunos(alunos1);
        seminario2.setAlunos(alunos2);

        Seminario[] seminarios1 = {seminario1, seminario2};
        Seminario[] seminarios2 = {seminario3};

        Professor professor1 = new Professor("Arthur Leão", "Ser leão (PHD)",seminarios1);
        Professor professor2 = new Professor("Junior", "Ser leão (Bacharel)",seminarios2);


        professor1.imprime();
        professor2.imprime();   

    }
}
