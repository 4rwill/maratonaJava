package academy.devdojo.maratonajava.poo.KmodificadorFinal.dominio;

public class Carro {
	// final funciona como um const
	//constantes seguem esse padrão de nomeclatura(caps e separada por underline)
	private String nome;
	public static final double VELOCIDADE_LIMITE = 200;
	public final Comprador COMPRADOR = new Comprador();
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
