/*
 Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */


package Repeticao;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		
		int idade, contador21=0, contador50=0;
		
		System.out.println("Digite a idade: ");
		idade= leia.nextInt();
		
		while(idade!=-99)
		{
			 if(idade<21)
				 contador21++;
			 
			 if(idade>50)
				 contador50++;
			 
			 System.out.println("Digite a idade: ");
			 idade = leia.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de : "+contador21);
		System.out.println("\nO total de pessoas com mais de 50 anos é de : " +contador50);
		System.out.println("FIM DO PROGRAMA");
	}

}
