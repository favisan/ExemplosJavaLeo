package br.com.rd.quartaturma.heranca.ex;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	public int variacao = 5;
	
	public int getVariacao() {
		return variacao;
	}

	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}

	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + getVariacao() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getVariacao();
		}
			
	}
	
	public void frear() {
		if(velocidadeAtual >= variacao) {
			velocidadeAtual -= variacao;
		}else {
			velocidadeAtual = 0;
		}
	}
	
	@Override
	public String toString() {
		
		return "Velocidade atual é : " + velocidadeAtual + " Km/h.";
	}
}
