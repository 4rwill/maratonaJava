package academy.devdojo.maratonajava.poo.Aclasses.test;

import academy.devdojo.maratonajava.poo.Aclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Will ";
        estudante.idade = 19 ;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }

}
