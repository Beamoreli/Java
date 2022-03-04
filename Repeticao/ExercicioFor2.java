//Ler 10 números e imprimir quantos são pares e quantos são ímpares.//

package Repeticao;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner (System.in);
		
		int num,par =0 ,impar =0;
	
		for(int x = 1; x <= 10; x++) {
			 System.out.println("Digite o " + x + "º número");
		        num = leia.nextInt();
			
		       if(num % 2 == 0)
		        {
		    	   par=par+1;
		        }
		        
		       
			       if(num % 2 == 1)   
			        {
			    	   impar=impar+1;
			        }
		}
        System.out.println("Foram digitados: " + par + " números pares" + " e " + impar + " números impares");
	}

}

