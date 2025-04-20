package academy.devdojo.maratonajava.exercicios.exercicio10;

public class MatrizTranspostaTest01 {
    public static void main(String[] args) {
        MatrizTransposta matrizTransposta = new MatrizTransposta();
        int[][] matriz = {{1, 2, 3, 7}, {4, 5, 6, 8}};
        matrizTransposta.transpor(matriz);
    }
}
