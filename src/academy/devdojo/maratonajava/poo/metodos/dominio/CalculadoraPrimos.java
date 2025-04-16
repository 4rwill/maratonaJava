package academy.devdojo.maratonajava.poo.metodos.dominio;

public class CalculadoraPrimos {
    public boolean verificarPrimo(int num){
        int quantidade = 0;
        boolean verificador = true;
        for (int i = 1; i < num+1 ; i++) {
            if(num % i == 0){
                quantidade += 1;
            }
        }
        verificador = quantidade == 2 ? true:false;
        return verificador;
    }

}
