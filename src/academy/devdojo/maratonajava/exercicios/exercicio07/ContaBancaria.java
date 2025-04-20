package academy.devdojo.maratonajava.exercicios.exercicio07;

public class ContaBancaria {
    private String nome;
    private double saldoInicial;

    public ContaBancaria(String nome, double saldoInicial){
        this.nome = nome;
        this.saldoInicial = saldoInicial;

        if (saldoInicial<0){
            System.out.println("Erro: Saldo não pode ser negativo!");
        }
        else{
            System.out.println("Nome: "+ nome);
            System.out.println("Saldo: "+ saldoInicial);
        }

    }
}
