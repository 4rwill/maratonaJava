package academy.devdojo.maratonajava.introducao;
/*
Comando:
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Will";
        String endereco = "Rua XXXX XXX";
        double salario = 4500.00;
        String dataSalario = "27/02/2025";

        System.out.println("Eu " +nome+", morando no endereço " + endereco + ", confirmo que recebi o salário de "+salario+", na data " + dataSalario);
    }
}
