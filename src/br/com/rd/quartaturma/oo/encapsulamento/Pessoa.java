package br.com.rd.quartaturma.oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade){
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}
	
	// Métodos de Acesso
	// Getter
	public int getIdade() {
		return this.idade;
	}
	
	// Setter
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade <= 120) {
			this.idade = idade;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	@Override
	public String toString() {
	
		return "Nome " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
	}
	
}


