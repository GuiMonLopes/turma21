package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Itens {
	
	static List<Itens> lista = new ArrayList<>();
	
	private String nome;
	private int quantidade;
	private int codigo;
	private String unidade;
	
	public Itens(String nome, int quantidade, int codigo,String unidade ) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.codigo = codigo;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public  String getUnidade() {
		return this.unidade;
		
	}
	
	public void setUnidade(String unidade) {
		
		this.unidade = unidade; 
	}
	
	public static void cadastroItens() {
		
		Scanner teclado = new Scanner(System.in);
		int quantidadeItens=0;
		
		System.out.println("CADASTRO DE ITENS: ");
		System.out.println("--------------------------");
		System.out.println("Digite a quantidade de Itens para cadastro: ");
		quantidadeItens = teclado.nextInt();
		
		for(int x=0; x<quantidadeItens; x++) {
			System.out.println("Informe o nome do item: ");
			String nomes = teclado.next().toUpperCase();
			System.out.println("Informe quantidade do item: ");
			int qtde = teclado.nextInt();
			System.out.println("Informe a unidade: ");
			String unidades = teclado.next().toLowerCase();
			int codigos = x;
			
			lista.add(new Itens(nomes, qtde, codigos,unidades));
			
		}
		
	
		
		
		
	}
	public void removerItens() {
		
	}
	public void atulizarDados() {
		
	}
	public void apresentarItens() {
		
	}
	
	
	

}
