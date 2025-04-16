package academy.devdojo.maratonajava.poo.modificadores.test;

import academy.devdojo.maratonajava.poo.modificadores.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Will");
        pessoa.setIdade(0);
//        pessoa.imprime();
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getNome());
    }
}
