package academy.devdojo.maratonajava.exercicios.exercicio03;

public class Tabuada {
    String resultado = "";
    public String tabuada(int num){
        for (int i = 1; i < 11 ; i++) {
            int conta = num*i;
                if (i == 10){
                resultado += num + "x" + i + "=" + conta;
            }
            else {
                resultado += num + "x" + i + "=" + conta + ", ";
            }

        }

        return resultado;
    }
}
