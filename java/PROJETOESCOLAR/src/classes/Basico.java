package classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Basico extends Estudante {
	GregorianCalendar gc = new GregorianCalendar();
	
	private int diaAniversario;

	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}

	public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario(double pontos) {
		if (diaAniversario == gc.get(Calendar.DAY_OF_MONTH)) {
			super.adicionarNota((pontos*0.1));
		}
	}
	
	
	

}
