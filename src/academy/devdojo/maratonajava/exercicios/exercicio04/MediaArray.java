package academy.devdojo.maratonajava.exercicios.exercicio04;

public class MediaArray {
    double[] notas;
    double media;
    double soma;
    public double calcularMedia(double[] notas){
        for (double nota:notas){
            soma += nota;
        }
        media = soma/ notas.length;
        return media;
    }
}
