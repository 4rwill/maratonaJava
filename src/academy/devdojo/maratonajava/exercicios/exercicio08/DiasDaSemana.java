package academy.devdojo.maratonajava.exercicios.exercicio08;

public class DiasDaSemana {
    String dia;
    public void imprimeDia (int num){
        switch (num){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Insira um dia válido (1-7)";
                break;
        }
        System.out.println(dia);
    }
}
