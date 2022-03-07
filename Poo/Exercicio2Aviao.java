/*
 Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package Poo;

public class Exercicio2Aviao {
	
	
	String passageiro;
	double trajeto;
	int passagens;
	boolean decolando;
	
	public void decolar() {
		this.decolando = true;
	}

	public void noChao() {
		this.decolando = false;
	}

	public void escrever() {
		if (this.decolando == true)
			System.out.println("Estamos decolando! ");
		else
			System.out.println("Ainda não decolamos.");

	}

	public void status() {
		System.out.println("Olá! " + this.passageiro);
		System.out.println("Quantas passagens?  " + this.passagens);
		System.out.println("O avião esta decolando?: " +this.decolando);
		System.out.println("Ainda estamos a  " +this.trajeto+"% de distancia do destino.");
		
}
}
