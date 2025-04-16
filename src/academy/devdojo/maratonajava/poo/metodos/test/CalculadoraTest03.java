package academy.devdojo.maratonajava.poo.metodos.test;

import academy.devdojo.maratonajava.poo.metodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideNumero(10,5);
        System.out.println(result);
        calculadora.imprimeDivisaoDeDoisNum(10,0);
    }
}
