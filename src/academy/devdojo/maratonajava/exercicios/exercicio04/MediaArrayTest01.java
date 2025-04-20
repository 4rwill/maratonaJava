package academy.devdojo.maratonajava.exercicios.exercicio04;

public class MediaArrayTest01 {
    public static void main(String[] args) {
        MediaArray mediaArray = new MediaArray();
        double[] notas = {7.5, 8.0, 6.5, 9.0,10};
        System.out.println(mediaArray.calcularMedia(notas));
    }
}
