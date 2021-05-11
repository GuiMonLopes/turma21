package PooLista1;

public class Aviao {
	
	String modelo;
	String fabricante;
	String numeroDeSerie;
	boolean ativo;
	int assentos;
	double autonomia;
	double combustivelMaximo;
	double velocidadeAtual = 0;
	double velocidadeMaxima = 0;
	double capacidadeDeCargaMaximo;
	
	void incrementoVelocidade(int incremento) {
		this.velocidadeAtual+=incremento;		
	}
	void decrementoVelocida(int decremento) {
		this.velocidadeAtual-=decremento;
	}
	
	void autonomiaMaxima() {
		double quilometros = this.combustivelMaximo/this.autonomia;
		System.out.println(quilometros);
		
	}

}
