package academy.devdojo.maratonajava.poo.Iherenca.test;

import academy.devdojo.maratonajava.poo.Iherenca.dominio.Endereco;
import academy.devdojo.maratonajava.poo.Iherenca.dominio.Funcionario;
import academy.devdojo.maratonajava.poo.Iherenca.dominio.Pessoa;

public class HerencaTest01 {
	public static void main(String[] args) {
		Endereco endereco = new Endereco();
		endereco.setRua("Rua 3");
		endereco.setCep("111000222");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Will");
		pessoa.setCpf("00000000022");
		pessoa.setEndereco(endereco);
		
		pessoa.imprime();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Christian");
		funcionario.setCpf("99999999999");
		funcionario.setEndereco(endereco);
		funcionario.setSalario(1000);
		System.out.println("----------");
		
		funcionario.imprime();
		
	}
}
