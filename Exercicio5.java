package introducao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.print("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			
		 System.out.print("Digite a segunda nota : ");
		 	nota2 = sc.nextDouble();
		 	
		 System.out.print("Digite a terceira nota: ");
		 	nota3 = sc.nextDouble();
		 
		 nota1 = nota1 * 2;
		 nota2 = nota1 * 3;
		 nota3 = nota1 * 5;
		 media = (nota1 + nota2 + nota1) / 10; 
				 System.out.println("A média é: " + media);
		 
	

	}

}

