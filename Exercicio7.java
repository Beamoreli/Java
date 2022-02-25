package introducao;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite os valores de A, B, C, D, E e F: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			d = sc.nextDouble();
			e = sc.nextDouble();
			f = sc.nextDouble();
		
		x=(c*e - b*f) / ( a*e - b*d);
		y=(a*f - c*d) / (a*e - b*d);
		
		System.out.println("os valores de X e Y são: " + x + " e " + y);
		
	}

}
