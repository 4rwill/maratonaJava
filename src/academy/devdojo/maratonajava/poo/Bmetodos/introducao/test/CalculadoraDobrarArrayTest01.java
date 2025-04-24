package academy.devdojo.maratonajava.poo.Bmetodos.introducao.test;

import academy.devdojo.maratonajava.poo.Bmetodos.introducao.dominio.CalculadoraDobrarArray;

import java.util.Arrays;

public class CalculadoraDobrarArrayTest01 {
    public static void main(String[] args) {
        CalculadoraDobrarArray calculadoraDobrarArray = new CalculadoraDobrarArray();

        int[] lista = {1,2,3,4,5};
        int[] dobrados = calculadoraDobrarArray.dobrar(lista);
        System.out.println(Arrays.toString(dobrados));
    }
}
