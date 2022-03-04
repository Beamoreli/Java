/*/
 Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
 */


package Repeticao;

import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		
		
		int num,soma=0;

		do {
	
		System.out.println("Digite um numero: ");
		num= leia.nextInt();

		soma += num;

		}while(num != 0);
		
		System.out.println("Soma = "+ soma);
	}

}
