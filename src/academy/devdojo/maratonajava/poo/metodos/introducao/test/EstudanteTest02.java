package academy.devdojo.maratonajava.poo.metodos.introducao.test;

import academy.devdojo.maratonajava.poo.metodos.introducao.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Endo";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Natsumi";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
