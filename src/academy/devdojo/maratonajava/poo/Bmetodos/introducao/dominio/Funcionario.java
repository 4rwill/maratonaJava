package academy.devdojo.maratonajava.poo.Bmetodos.introducao.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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
    }

    public void mediaSalario(){
        if (salario == null){
            return;
        }
        double media = 0;
        for (int i = 0; i < salario.length; i++) {
            media += salario[i];
        }
        media /= salario.length;
        System.out.println("\nSalário Médio: " + media );
    }

}
