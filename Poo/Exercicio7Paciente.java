/*/
Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package Poo;

public class Exercicio7Paciente {

	String paciente;
	double cura;
	int dias;
	boolean internado;
	
	public void internar() {
		this.internado = true;
	}

	public void alta() {
		this.internado= false;
	}

	public void lembrete() {
		if (this.internado == true)
			System.out.println("O paciente está internado.");
		else
			System.out.println("Paciente recebeu alta.");

	}

	public void status() {
		System.out.println("Olá : " + this.paciente);
		System.out.println("Dias de internação: " + this.dias);
		System.out.println("Porcentagem de melhora:  " + this.cura +"%");
		System.out.println("Paciente internado? " + this.internado);
	
	}
}

