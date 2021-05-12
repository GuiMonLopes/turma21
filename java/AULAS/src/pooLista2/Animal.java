package pooLista2;

public abstract class Animal {
	private String  nome;
	private int idade;
	private String emiteSom;
	private String movimento;
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(String emiteSom) {
		this.emiteSom = emiteSom;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
	public String getMovimento() {
		return movimento;
	}
	
	
	public void som() {
		System.out.println("Emitir som");
	}
	public void movimentar() {
		System.out.println("Correr");
	}
	
	
	

}
