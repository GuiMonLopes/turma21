package PooLista1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Funcionario {
	GregorianCalendar gc = new GregorianCalendar();

	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean status;
	int matricula;
	double salario;
	int anoContratado;

	public Funcionario(String nome, int matricula) {

		this.nome = nome;
		this.matricula = matricula;

	}

	public Funcionario(String nome, int matricula, int anoContratado) {
		this.nome = nome;
		this.matricula = matricula;
		this.anoContratado = anoContratado;
	}

	void verificarStatus(char status) {
		if (status == '1') {
			this.status = true;
		} else {
			this.status = false;

		}

	}

	void imprimirStatus() {
		if (this.status == true) {
			System.out.println("Ativo");
		} else {
			System.out.println("Inativo");
		}
	}

	void tempoDeEmpresa() {
		int tempoEmpresa = gc.get(Calendar.YEAR) - anoContratado;
		System.out.println(tempoEmpresa + " anos.");
	}

}
