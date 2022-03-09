package Polimorfismo;

public abstract class Preguica extends Animal{

	 String subir;
	 @Override
		public void emitirSom(){
			System.out.println("Som de Animal.");
		}
	public String getSubir() 
	{
		return subir;
	}

	public void setSubir(String subir) 
	{
		this.subir = subir;
	}	
}