package br.com.rd.quartaturma.heranca.ex;

public class Ferrari extends Carro
					 implements Esportivo, Luxo{

	boolean ligarTurbo;
	boolean ligarAr;
	
	public Ferrari(){
		this(312);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		variacao = 15;
	}
	
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	public void ligarArCondicionado() {
		ligarAr = true;
		
	}
	
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}
	
	public void desligarArCondicionado() {
		ligarAr = false;
		
	}
	
	@Override
	public int getVariacao() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		}else if(ligarTurbo && ligarAr) {
			return 30;
		}else if(!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}
	
}
