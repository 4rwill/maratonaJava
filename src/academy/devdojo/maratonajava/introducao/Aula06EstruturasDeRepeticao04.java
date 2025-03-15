package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição: valorParcela>= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        int parcela;
        for (parcela = 1; parcela <=valorCarro ; parcela++) {
            double valorParcela = valorCarro/parcela;
            if(valorParcela<1000){
                break;
            }
            System.out.println(parcela + " Parcelas de: R$"+valorParcela);

        }

    }
}
