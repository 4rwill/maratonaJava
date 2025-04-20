package academy.devdojo.maratonajava.exercicios.exercicio09;

public class ForeachSoma {
    int soma;
    public int somar(int[] numeros){
        for (int numero : numeros){
            soma += numero;
        }
        return soma;
    }
}
