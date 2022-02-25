package introducao;

import java.util.Scanner;
import java.math.*;



public class Exercicio4 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, r, s, d;
		
		
		System.out.println("Digite o valor de A: ");
			a = sc.nextDouble();
		
		System.out.println("Digite o valor de B: ");
			b = sc.nextDouble();;
		
		System.out.println("Digite o valor de C: ");
			c = sc.nextDouble();
		
		r = Math.pow(a + b, 2);
		s = Math.pow(b + c, 2);
		d = r + s / 2;
		
		System.out.println("\n O resultado é: " + d);
				
	}

}
