package introducao;

import java.util.Scanner;
import java.math.*;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distancia;
		
		
		System.out.println("Digite as duas coordenadas do ponto inicial : ");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();

		System.out.println("Digite as duas coordenadas do ponto terminal: ");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		System.out.println("A distancia entre os posntos é: " + distancia);
	}

}
