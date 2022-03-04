package Repeticao;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		

		int idade, sexo, emocao, contador=0;
		int calmo=0, nervoso=0, agressivo=0;
		int oCalmo=0, oNervoso=0, jCalmo=0;
		
		while(contador<150)
			{
			
			System.out.println("Digite a idade: ");
			idade= leia.nextInt();
			
			System.out.println("Digite seu sexo com (1)Femino, (2)Masculino, (3)Outro: ");
			sexo = leia.nextInt();
					
			System.out.println("Digite seu sexo com (1)calmo, (2)nervoso, (3)agressivo: ");
			emocao = leia.nextInt();
			
			if(emocao==1) 
				calmo++;
			if(sexo==1 && emocao==2) 
				nervoso++;
			if(sexo==2 && emocao==3) 
				agressivo++;
			if(sexo==3 && emocao==1) 
				oCalmo++;
			if(idade>40 && emocao==2)
				oNervoso++;
			if(idade<18 && emocao==1)
				jCalmo++;
			
			contador++;
		}
		
		System.out.println("Numero de pessoas calmas" + calmo);
		System.out.println("Numero de mulheres nervosas" + nervoso);
		System.out.println("Numero de homens agressivos " + agressivo);
		System.out.println("Numero de Outros calmos" + oCalmo);
		System.out.println("Pessoas nervosas com mais de 40 anos: " + oNervoso);
		System.out.println("Pessoas calmas com menos de 18 anos:  " + jCalmo);
		
	}

}
