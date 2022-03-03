package Condicao;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio4 {

	public static void main(String[] args) {

		
			Scanner leia= new Scanner (System.in);
				
			int numero;
			double raiz, potencia;
			
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 2 ==0)
			{
				raiz = Math.sqrt(numero);
				System.out.println("O numero é par e sua raiz é: " + raiz);
			}
	
			else 
			{
				potencia = Math.pow(numero,2 );
				System.out.println("o número é ímpar e sua potencia é: " + potencia);
			}
	}

}
