package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //(valores iniciais de array)
        //byte, short, int, long, float, double = 0
        //char '\u0000' = ' '
        //boolean = false
        //String = null
        String[] nomes = new String[3];
        nomes[0] = "will";
        nomes[1] = "jordan";
        nomes[2] = "sasuke";
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println("nome: " + nomes[i]);

        }
    }
}
