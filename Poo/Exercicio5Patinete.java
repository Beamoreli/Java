/*
Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */


package Poo;

public class Exercicio5Patinete {
  

		String modelo;
		double rapido;
		int rolamento;
		boolean andando;
	
			public void andar() {
				this.andando = true;
			}
		
			public void parado() {
				this.andando = false;
			}
		
			public void dica() {
				if (this.andando == true)
					System.out.println("Esta indo muito bem! ");
				else
					System.out.println("Continue tentando");
		
			}
	
		public void status() {
			System.out.println("Qual o modelo do seu patinete?: " + this.modelo);
			System.out.println("Qual a numera��o do seu rolamento? " + this.rolamento);
			System.out.println("O patinete est� em movimento? " + this.andando);
			System.out.println("Seu patinete � " + this.rapido + "% rapido.");
		}
}