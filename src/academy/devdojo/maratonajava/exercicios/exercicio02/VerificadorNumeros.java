package academy.devdojo.maratonajava.exercicios.exercicio02;


public class VerificadorNumeros {
    String tipo;
    public void verificaTipo(int num){
        if(num>0) tipo = "Positivo";
        else if (num<0) tipo = "Negativo";
        else tipo = "Zero";
        System.out.println(tipo);
    }





}
