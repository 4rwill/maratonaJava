package academy.devdojo.maratonajava.poo.Gestatico.test;

import academy.devdojo.maratonajava.poo.Gestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180);

        Carro c1 = new Carro("Porsche 911", 290);
        Carro c2 = new Carro("Lancer Evo", 260);


        c1.imprime();
        c2.imprime();
    }
}
