package academy.devdojo.maratonajava.poo.Aclasses.test;

import academy.devdojo.maratonajava.poo.Aclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Julia";
        professor.idade = 32;
        professor.sexo = 'F';

        System.out.println(professor.nome+", "+professor.idade+" anos, sexo: "+professor.sexo);
    }
}
