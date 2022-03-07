package Poo;

public class Exercicio3EletronicoObjeto {

	public static void main(String[] args) {
		Exercicio3Eletronico cel1 = new Exercicio3Eletronico();
		Exercicio3Eletronico cel2 = new Exercicio3Eletronico();

		cel1.cor = "Preto";
		cel1.apps = 6;
		cel1.desligar();
		cel1.bateria = 50;
		cel1.status();
		cel1.situacao();
		
		System.out.println("- - - - - ");
		cel2.cor = "Cinza";
		cel2.apps =  50;
		cel2.ligar();
		cel2.bateria = 15;
		cel2.status();
		cel2.situacao();

	}

}
