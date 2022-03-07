package Poo;

public class Exercicio2AviaoObjeto {

	public static void main(String[] args) {
		
		Exercicio2Aviao p1 = new Exercicio2Aviao();
		Exercicio2Aviao p2 = new Exercicio2Aviao();

		p1.passageiro = "Augusto. Tenha uma boa viagem!";
		p1.passagens = 1;
		p1.decolar();
		p1.trajeto = 30;
		p1.status();
		p1.escrever();

		System.out.println(" - - - - - ");
		p2.passageiro = "Ana.Tenha uma boa viagem!";
		p2.passagens = 4;
		p2.noChao();
		p2.trajeto = 235;
		p2.status();
		p2.escrever();

	}

}
