package academy.devdojo.maratonajava.poo.Bmetodos.introducao.test;

import academy.devdojo.maratonajava.poo.Bmetodos.introducao.dominio.Estudante;
import academy.devdojo.maratonajava.poo.Bmetodos.introducao.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Endo";
        estudante01.idade = 16;
        estudante01.sexo = 'M';

        estudante02.nome = "Natsumi";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);







    }
}
