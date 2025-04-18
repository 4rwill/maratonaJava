package academy.devdojo.maratonajava.poo.metodos.introducao.test;

import academy.devdojo.maratonajava.poo.metodos.introducao.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNum();
        System.out.println("Finalizando Soma...");
        calculadora.subtraiDoisNum();
        System.out.println("Finalizando Subtração...");
    }
}
