package br.com.rd.quartaturma.oo.polimorfismo;

public class Feijao extends Comida{
	private double peso;

	public Feijao(double peso) {
		super(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
