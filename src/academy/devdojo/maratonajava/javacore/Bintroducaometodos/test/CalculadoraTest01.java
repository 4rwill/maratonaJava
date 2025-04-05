package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNum();
        System.out.println("Finalizando Soma...");
        calculadora.subtraiDoisNum();
        System.out.println("Finalizando Subtração...");
    }
}
