package academy.devdojo.maratonajava.poo.MclassesAbstratas.test;

import academy.devdojo.maratonajava.poo.MclassesAbstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.poo.MclassesAbstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.poo.MclassesAbstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente1 = new Gerente("Chris",6000);
        Desenvolvedor desenvolvedor1 = new Desenvolvedor("Will",16000);
        System.out.println(gerente1);
        System.out.println(desenvolvedor1);
        desenvolvedor1.imprime();
    }
}
