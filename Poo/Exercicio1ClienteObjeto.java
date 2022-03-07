package Poo;

public class Exercicio1ClienteObjeto {

	public static void main(String[] args) {
		Exercicio1Cliente c1 = new Exercicio1Cliente();
		Exercicio1Cliente c2 = new Exercicio1Cliente();

		c1.nome = "Joana";
		c1.consumo = 60;
		c1.frequentar();
		c1.desconto = 40;
		c1.status();
		c1.anuncio();
		
		System.out.println("- - - - -");
		c2.nome = "Otavio";
		c2.consumo = 10;
		c2.ausente();
		c2.desconto = 2;
		c2.status();
		c2.anuncio();

	}

}
