package introducao;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double custoFabrica, distribuidor, impo, custoConsu;
		System.out.print("Digite o preço de fábrica do veículo: ");
			custoFabrica = sc.nextDouble();
		
		distribuidor = custoFabrica * 0.28;
		impo = custoFabrica * 0.45;
		custoConsu = custoFabrica + distribuidor + impo;
		
		System.out.println("O valor de custo do consumidor é de :  " + "R$ " + custoConsu);
		
	}

}
