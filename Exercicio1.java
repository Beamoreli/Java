package Condicao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double n1,n2,n3, maior, menor;
		
		System.out.println("Digite o valor do primeiro numero: ");
		n1 = leia.nextDouble();
		System.out.println("Digite o valor do segundo numero: ");
		n2 = leia.nextDouble();
		
		System.out.println("Digite o valor do terceiro numero: ");
		n3 = leia.nextDouble();
		
		  if(n1 < n2){
		        if(n1 < n3)
		            menor = n1;
		        else
		            menor = n3;
		    }
		  else {
		        if(n2 < n3)
		            menor = n2;
		        else
		            menor = n3;
		    }
		  if(n1 > n2){
		        if(n1 > n3)
		            maior = n1;
		        else
		            maior = n3;
		    }
		    else {
		        if(n2 > n3)
		            maior = n2;
		        else
		            maior = n3;
		        }
		  System.out.println("O menor numéro é: " + menor + "\nO maior número é:  " + maior );
	}
		  
}
