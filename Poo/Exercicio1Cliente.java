/*/ Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console. */


package Poo;

	public class Exercicio1Cliente {
		String nome;
		double desconto;
		int consumo;
		boolean frequencia;
	
		public void frequentar() {
			this.frequencia = true;
		}
	
		public void ausente() {
			this.frequencia = false;
		}
	
		public void anuncio() {
			if (this.frequencia == true)
				System.out.println("O cliente ira ganhar mais desconto");
			else
				System.out.println("Conhe�a novos produtos e adquira descontos.");
	
		}
	
		public void status() {
			System.out.println("Cliente: " + nome);
			System.out.println("Cliente frequente? " + frequencia);
			System.out.println("Seu consumo foi de R$ " + consumo);
			System.out.println("Seu desconto � de: " + desconto + "%");
	}
}
