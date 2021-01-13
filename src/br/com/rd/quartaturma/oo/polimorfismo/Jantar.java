package br.com.rd.quartaturma.oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(99.65);
		
		Comida item1 = new Arroz(0.20);
		Comida item2 = new Feijao(0.10);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(item1);
		convidado.comer(item2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.40);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}
}
