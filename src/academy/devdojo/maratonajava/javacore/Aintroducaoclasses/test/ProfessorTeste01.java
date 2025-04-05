package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Julia";
        professor.idade = 32;
        professor.sexo = 'F';

        System.out.println(professor.nome+", "+professor.idade+" anos, sexo: "+professor.sexo);
    }
}
