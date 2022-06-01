package modelo;

public class Cliente {
	private String nome;
	private String telefone;
	private int idade;
	private int estrela;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getEstrela() {
		return estrela;
	}
	public void setEstrela(int estrela) {
		this.estrela = estrela;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", idade=" + idade + "]";
	}
}
