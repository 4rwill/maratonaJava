package academy.devdojo.maratonajava.poo.Aclasses.test;

import academy.devdojo.maratonajava.poo.Aclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Lancer";
        carro1.modelo = "Evo";
        carro1.ano = 2014;

        carro2.nome = "Porsche";
        carro2.modelo = "911";
        carro2.ano = 2017;

        carro1 = carro2;
        // faz com que o carro1 receba os mesmo atributos do carro2, fazendo assim os atributos antes associados ao carro1 serem perdidos na memória

        System.out.println("Carro do Will: " + carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println("Carro do Gust: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
