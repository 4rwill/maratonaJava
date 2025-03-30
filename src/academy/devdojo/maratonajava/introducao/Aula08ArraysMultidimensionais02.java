package academy.devdojo.maratonajava.introducao;
//É possível definir o tamanho de cada substring atráves da inicialização

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int [] numeros = {1,2,3};

        arrayInt[0]= new int[2];
        arrayInt[1]= numeros;
        arrayInt[2]= new int[4];

        int arrayInt2[][] = {{1,2},{1,2,3,4},{1,2,3,4,5}};

        for (int[] arrayBase:arrayInt2){
            System.out.println("\n---");
            for (int num:arrayBase){
                System.out.print(num + " ");
            }
        }



    }
}
