package academy.devdojo.maratonajava.poo.metodos.test;

import academy.devdojo.maratonajava.poo.metodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alteraDoisNumeros(a,b);
        System.out.println("Dentro da CalculadoraTest04");
        System.out.println("numero1: " +a);
        System.out.println("numero2: " +b);


    }
}
//EXPLICAÇÃO:

//a = 1 e b = 2 são copiados para numero1 e numero2.
//Dentro do método, você muda os valores de numero1 e numero2 para 99 e 33, mas essas mudanças afetam apenas as cópias.
//Fora do método, a e b continuam com os valores originais, 1 e 2, porque não foram alterados diretamente, só suas cópias.
