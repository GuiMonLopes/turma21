package PooLista1;

public class Notebook {
	
	String marca;
	String modelo;
	String numeroDeSerie;
	boolean ativo;
	String tipoDeTela;
	int memoriaRam;
	int discoRigido;
	int quantidadesDeEntradasUsb;
	int quantidadesDeEntradasHdmi;
	String Processador;
	double autonomiaDaBateria;
	double potenciaDoNotebook;
	
	public void liga() {
		this.ativo=true;
		System.out.println("Notebook ligado!");
	}
	void desliga() {
		this.ativo=false;
		System.out.println("Notebook desligado!");
	}
	void capacidadeBateria() {
		double corrente = this.potenciaDoNotebook/19.00;
		double capacidadeBateria  = this.autonomiaDaBateria*corrente;
		capacidadeBateria = capacidadeBateria*1000.00;
		System.out.printf("\n%.2f mAh\n",capacidadeBateria);
		
	}
	

}
