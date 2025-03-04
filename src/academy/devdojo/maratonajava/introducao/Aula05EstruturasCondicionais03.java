package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador Ternário
        // (condicao) ? true : false;
        int salario = 7000;
        String mensagemCelularCaro = "Você comprou um Iphone 15";
        String mensagemCelularBarato = "Você comprou um A06 KKKKKK";
        String resultado = salario >= 4000 ? mensagemCelularCaro : mensagemCelularBarato;

        System.out.println(resultado);
    }
}
