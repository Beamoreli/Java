/*
 Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero)
 */

package Repeticao;

import java.util.Scanner;

public class ExerciciosDoWhile2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		
		int num=0, cont=0,soma=0,media=0;
		
		do {
			System.out.println("Insira um valor: ");
			num = leia.nextInt();
			
			if(num%3==0)
			{
				soma+=num;
				cont++;
				}
			
		}
			while(num !=0);
			{
				media= soma /cont;
				System.out.println("Quantidade de repeti��o de multiplo de 3: " + cont);
			}	

		}
	}
	
