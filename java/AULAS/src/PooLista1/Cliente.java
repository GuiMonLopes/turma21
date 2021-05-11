package PooLista1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Cliente {
	GregorianCalendar gc = new GregorianCalendar();
	
	//atributo
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean status;
	
	//metodo
	public void idadeAproximada(){
		
		int idadeAproximada = gc.get(Calendar.YEAR)-anoNascimento;
		
		System.out.println(idadeAproximada+" anos");
	}
	void verificarStatus(char status) {
		if(status=='1') {
			this.status = true;
		}else {
			this.status=false;
			
		}
		
	}
	void imprimirStatus() {
		if(this.status==true) {
			System.out.println("Ativo");
		}else {
			System.out.println("Inativo");
		}
	}
	

}
