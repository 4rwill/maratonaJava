package academy.devdojo.maratonajava.poo.Iherenca.test;

import academy.devdojo.maratonajava.poo.Iherenca.dominio.Funcionario;

public class HerancaTest02 {
	
	//0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
	//1 - Bloco de inicialização estático da subclasse é executado quando a JVM carrregar a classe filha
	//2 - Alocado espaço em memória pro objeto da super classe
	//3 - Cada atributo de super classe é criado e inicializado com valores default ou o que for passado
	//4 - Bloco de inicialização da super classe é executado na ordem em que aparece
	//5 - Construtor da super classe é executado
	//6 - Alocado espaço em memória pro objeto da subclasse
	//7 - Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
	//8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
	//9 - Construtor da subclasse é executado
	

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Will");
	}

}
