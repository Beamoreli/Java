package Poo;

import java.util.Scanner;

public class Exercicio6ContaObjeto {

	public static void main(String[] args) {
		int x;

		Scanner senha = new Scanner(System.in);

		System.out.print("Digite sua senha: ");

		x = senha.nextInt();

		Exercicio6Conta user1 = new Exercicio6Conta();

		user1.usuario= "Gustavo";
		user1.saldo = 9000.00;
		user1.senha(x);
		user1.usar();
		user1.status();
		user1.lembrete();
		
		System.out.println("- - - - - - - ");
		user1.usuario= "Gisele";
		user1.saldo = 50.00;
		user1.senha(x);
		user1.parado();
		user1.status();
		user1.lembrete();

		senha.close();

	}

}
