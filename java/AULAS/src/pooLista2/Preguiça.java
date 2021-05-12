package pooLista2;

public class Preguiça extends Animal {
	

	private boolean escalarArvore;

	public Preguiça(String nome, int idade, boolean escalarArvore) {
		super(nome, idade);
		this.escalarArvore = escalarArvore;
	}

	public boolean isEscalarArvore() {
		return escalarArvore;
	}

	public void setEscalarArvore(boolean escalarArvore) {
		this.escalarArvore = escalarArvore;
	}
	@Override
	public void movimentar() {
		System.out.println("Subir em arvore.");
	}

}
