package academy.devdojo.maratonajava.introducao.aula08;

//Array Multidimensional: o primeiro [] define a quantidade de arrays principais, já o segundo serve pra definir quantos elementos terão nos arrays secundários, ou seja, cada array principal vai criar um array secundário.

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[0][2] = 30;

        dias[1][0] = 40;
        dias[1][1] = 50;
        dias[1][2] = 60;

        dias[2][0] = 70;
        dias[2][1] = 80;
        dias[2][2] = 90;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("------------------------------");
        System.out.println("Com foreach");
        for(int[] arrayBase:dias){
            for (int num: arrayBase){
                System.out.println(num);
            }
        }
    }
}
