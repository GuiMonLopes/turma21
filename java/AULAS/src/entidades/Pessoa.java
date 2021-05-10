package entidades;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pessoa {
	GregorianCalendar gc = new GregorianCalendar();
	
	//atributo
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean vivo;
	
	//metodo
	public void idadeAproximada() {
		
		System.out.println(gc.get(Calendar.YEAR)-anoNascimento);
	}
	
	
	
	

}
