package academy.devdojo.maratonajava.poo.Fmodificadores.test;

import academy.devdojo.maratonajava.poo.Fmodificadores.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Will");
        funcionario.setIdade(20);
        funcionario.setSalario(new double[]{1000,2500,7000});
        funcionario.imprimirDados();
    }
}
