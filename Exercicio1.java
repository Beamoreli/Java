package introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anos, meses, dias, resp;
		
		
		System.out.print("Quantos anos voc� tem?: " );
			anos = sc.nextInt();
		
		System.out.print("Quantos meses voc� tem?: " );
			meses = sc.nextInt();
		
		System.out.print("Quantos dias voc� tem?: " );
			dias = sc.nextInt();
		
		resp = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias �: " +  resp);
		

	}

}
