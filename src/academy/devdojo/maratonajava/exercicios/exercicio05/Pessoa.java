package academy.devdojo.maratonajava.exercicios.exercicio05;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimeDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }






    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }
    public int getIdade (){
        return idade;
    }
}
