package Poo;

public class Exercicio5PatineteObjeto {
	
	
	
	public static void main(String[] args) {
		Exercicio5Patinete pat1 = new Exercicio5Patinete();
		Exercicio5Patinete pat2 = new Exercicio5Patinete();

		pat1.modelo = "Modelo Adulto 2022";
		pat1.rolamento = 12;
		pat1.parado();
		
		pat1.rapido = 100;
		pat1.status();
		pat1.dica();

		System.out.println(" -- ");
		pat2.modelo = "Infantil 2021";
		pat2.rolamento = 17;
		pat2.andar();
		
		pat2.rapido = 25;
		pat2.status();
		pat2.dica();
	}
}
