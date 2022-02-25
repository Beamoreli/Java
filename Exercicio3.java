package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int evento, hora, minuto, segundos, restante;
		
		System.out.println("Digite quanto durou o evento em segundos: ");
		
		
			evento = sc.nextInt();
			hora = evento / 3600;
			restante = evento % 3600;
			minuto = restante / 60;
			segundos = restante % 60;
			
		System.out.println("O tempo de duração do é: " + hora + " horas, " + minuto + " minutos e " + segundos + " segundos.");
		

	}

}
