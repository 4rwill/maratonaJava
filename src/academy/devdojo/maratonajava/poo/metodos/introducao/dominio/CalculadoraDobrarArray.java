package academy.devdojo.maratonajava.poo.metodos.introducao.dominio;

public class CalculadoraDobrarArray {

    public int[] dobrar(int...lista){
        for (int i = 0; i < lista.length ; i++) {
            lista[i] *= 2;

        }
        return lista;
    }

}
