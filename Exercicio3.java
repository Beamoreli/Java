package Condicao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade= 0;
		System.out.println("Digite a idade: ");
		idade= leia.nextInt();
		
		if (idade >=10 && idade <=14)
			System.out.println("A idade se encontra na categoria : infantil");
		
		else if (idade >=15 && idade <=17)
			System.out.println("A idade se encontra na categoria: Juvenil ");
		
		else if  (idade >=18 && idade <=25)
			System.out.println("A idade se encontra na categoria: Adulto");
		else 
			System.out.println("Não se encaixa em nenhuma categoria");
	}

}
