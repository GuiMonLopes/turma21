package pooLista2;

public class Cavalo extends Animal{
	
	private boolean correr;

	public Cavalo(String nome, int idade, boolean correr) {
		super(nome, idade);
		this.correr = correr;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	@Override
	public void som() {
		System.out.println("Hiin in in");
	}
	

}
