/*
Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.
 */

package Poo;

public class Exercicio3Eletronico {
	
	
	String cor;
	double bateria;
	int apps;
	boolean ligado;
	
	public void ligar()
	{
		this.ligado=true;
	}
	public void desligar()
	{
		this.ligado=false;
	}

	public void situacao() {
		if (this.ligado == true)
			System.out.println("Notebook ligado.");
		else
			System.out.println("Notebook esta desligado. ");	
	}
		
		public void status() {
			System.out.println("Cor do Notebook: " + this.cor);
			System.out.println("o notebook est� ligado? " + this.ligado);
			System.out.println("Quantos apps?" + this.apps);
			System.out.println("Porcentagem de bateria: " + this.bateria + "%");
	
	
}
}
