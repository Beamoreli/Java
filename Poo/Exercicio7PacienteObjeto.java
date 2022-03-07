package Poo;

public class Exercicio7PacienteObjeto {

	public static void main(String[] args) {
		
		Exercicio7Paciente pac1 = new Exercicio7Paciente();

		pac1.paciente= "Alberto Fernandes";
		pac1.dias = 7;
		pac1.internar();
		pac1.cura = 23;
		pac1.status();
		pac1.lembrete();

		System.out.println("- - - - - ");
		pac1.paciente= "Luis Romeiro";
		pac1.dias = 54;
		pac1.alta();
		pac1.cura = 100;
		pac1.status();
		pac1.lembrete();

	}

}
