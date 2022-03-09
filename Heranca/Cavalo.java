package Heranca;

public abstract class Cavalo extends Animal {
	
	 String correr;
	 @Override
		public void emitirSom(){
			System.out.println("Relinchando.");
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
