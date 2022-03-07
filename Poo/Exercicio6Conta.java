/*
Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
	
	package Poo;
	
	public class Exercicio6Conta {
		String usuario;
		double saldo;
		int senha;
		boolean emUso;
		
		public void usar() {
			this.emUso = true;
		}

		public void parado() {
			this.emUso= false;
		}

		public void lembrete() {
			if (this.emUso == true)
				System.out.println("Colhendo informações.");
			else
				System.out.println("Aguardando comandos.");

		}

		public void status() {
			System.out.println("Olá: " + this.usuario);
			System.out.println("Seu saldo é de R$" + this.saldo);
			System.out.println("Máquina em uso?" + this.emUso);
		}

		public void senha(int x) {
			
		}
		
	}
