package academy.devdojo.maratonajava.poo.modificadores.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;


    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        if (salario == null){
            return;
        }

        System.out.print("Salário: ");
        for (int i = 0; i < salario.length ; i++) {
            System.out.print(salario[i] + " ");
        }
        mediaSalario();
    }

    public void mediaSalario(){
        if (salario == null){
            return;
        }
        for (int i = 0; i < salario.length; i++) {
            media += salario[i];
        }
        media /= salario.length;
        System.out.println("\nSalário Médio: " + media );
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }


}
