package academy.devdojo.maratonajava.poo.metodos.test;

import academy.devdojo.maratonajava.poo.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Will";
        funcionario.idade = 20;
        funcionario.salario = new double[   ]{100,200,300};

        funcionario.imprimirDados();
        funcionario.mediaSalario();
        }
    }

