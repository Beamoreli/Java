package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, resp, sobra;
		
		System.out.println("Digite sua idade em dias: ");
		
			resp = sc.nextInt();
			anos = resp / 365;
			sobra = resp % 365;
			meses = sobra / 30;
			dias = sobra % 30;
		
		System.out.println("\nSua idade é: " + anos +" anos, "+meses+" meses e " +dias +" dias");
		
	
	}

}
