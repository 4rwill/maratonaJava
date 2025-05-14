package academy.devdojo.maratonajava.poo.Iherenca.dominio;

public class Funcionario extends Pessoa {
	
	private double salario;
	
	
	static {
		System.out.println("Dentro do bloco de inicialização estático de Funcionário");
	}
	
	{
		System.out.println("Dentro do bloco de inicialização de Funcionário 1");
	}
	
	{
		System.out.println("Dentro do bloco de inicialização de Funcionário 2");
	}
	
	
	public Funcionario(String nome) {
		super(nome);
		System.out.println("Dentro do construtor de funcionário");
	}

	
	
	public void imprime() {
		super.imprime();
		System.out.println(this.salario);
		
	}
	
	public void relatorioPagamento() {
		System.out.println("Eu " + this.nome + "recebi um salário de " + this.salario);
	}
	
	
	

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
	
	

}
