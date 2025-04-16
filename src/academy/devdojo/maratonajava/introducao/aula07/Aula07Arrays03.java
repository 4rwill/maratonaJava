package academy.devdojo.maratonajava.introducao.aula07;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //formas de definir um array
        int[] numeros = new int[5]; //Esse aqui cria o array e define o tamanho
        int[] numeros2 = {1,2,3,4,5}; // Forma de já definir o que tem dentro do array direto
        int[] numeros3 = new int[]{1,2,3,4,5};


        //foreach
        for(int i:numeros3){
            System.out.println(i);
        }

    }
}
