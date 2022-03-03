package Condicao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double n1,n2,n3, ordem;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = leia.nextDouble();
		
		if (n2 < n1)
			{
				ordem = n1;
		        n1 = n2;
		        n2 = ordem;
			}
		
		if(n3 < n1)
		  	{
		        ordem = n1;
		        n1 = n3;
		        n3 = ordem;
		    }

		 if(n3 < n2)
		    {
		       ordem = n2;
		        n2 = n3;
		        n3 = ordem;
		    }
		 
		System.out.println( "A ordem crescente dos números são: "+ n1 + ", "+ n2 + " e " + n3);

	}

}
