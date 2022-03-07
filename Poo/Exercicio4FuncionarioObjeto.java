package Poo;

public class Exercicio4FuncionarioObjeto {

	public static void main(String[] args) {
	
		Exercicio4Funcionario func1 = new Exercicio4Funcionario();
		Exercicio4Funcionario func2 = new Exercicio4Funcionario();

		func1.funcionario = "Emanuel";
		func1.dias = 10;
		func1.parado();
		func1.jornada=12;
		func1.status();
		func1.situacao();
		
		System.out.println("- - - - - - ");
		func2.funcionario = "Amanda";
		func2.dias = 22;
		func2.trabalhar();
		func2.jornada=67;
		func2.status();
		func2.situacao();

	}

}
