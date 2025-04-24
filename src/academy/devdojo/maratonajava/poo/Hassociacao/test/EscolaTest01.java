package academy.devdojo.maratonajava.poo.Hassociacao.test;

import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Escola;
import academy.devdojo.maratonajava.poo.Hassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1  = new Professor("Will");
        Professor professor2  = new Professor("Caio");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Sophos",professores);

        escola.imprime();

    }
}
