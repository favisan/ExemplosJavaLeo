package br.com.rd.quartaturma.oo.polimorfismo;

public class Arroz extends Comida{
	private double peso;

	public Arroz(double peso) {
		super(peso);
		
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
