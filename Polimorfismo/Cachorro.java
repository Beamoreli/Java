package Polimorfismo;

public abstract class Cachorro extends Animal{
	
	 String correr;
	 
	 @Override
		public void emitirSom(){
			System.out.println("Latindo.");
		}
	 
	public String getCorrer() 
	
	{
		return correr;
	}

	public void setCorrer(String correr)
	{
		this.correr = correr;
	}
}