package br.com.rd.quartaturma.oo.polimorfismo;

public class Sorvete extends Comida{
	private double peso;

	public Sorvete(double peso) {
		super(peso);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
