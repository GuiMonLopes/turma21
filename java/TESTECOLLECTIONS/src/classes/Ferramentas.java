package classes;

public class Ferramentas extends Itens{
	
	private String tipo;
	

	public Ferramentas(String nome, int quantidade, int codigo, String unidade, String tipo) {
		super(nome, quantidade, codigo, unidade);
		this.tipo = tipo;
		
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		
		this.tipo=tipo;
	}

}
