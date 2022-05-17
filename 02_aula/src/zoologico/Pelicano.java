package zoologico;

public class Pelicano {
	private boolean bico;
	private String cor;
	private int peso;
	
	public String getcor() {
		return cor;
	}
	
	public void setCor() {
		this.cor = cor;
	}
	
	public void getPeso() {
		return peso;
	}
	
	public void setPeso() {
		this.peso = peso;
	}
	
	public void voar() {
		if(peso > 50) {
			System.out.println("O pelicano n�o consegue voar, est� muito pesado");
		} else {
			System.out.println("O pelicano est� voando!");
		}
	}
	
	public void comer() {
		System.out.println("O pelicano est� comendo!");
	}
	
	public void definirNome(String nome) {
		System.out.println("O nome do pelicano �: " + nome);
	}
	
	public String retornarCor() {
		return cor;
	}

}
