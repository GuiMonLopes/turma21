package PooLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto produto eletr�nico, defina as instancias deste objeto e apresente as 
		 * informa��es deste objeto no console.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Notebook note1 = new Notebook();
		
		System.out.println("Informe o modelo: ");
		note1.modelo = teclado.next();
		System.out.println("Informe a autonomia em horas: ");
		note1.autonomiaDaBateria= teclado.nextDouble();
		System.out.println("Informe a potencia em watts: ");
		note1.potenciaDoNotebook = teclado.nextDouble();
		
		note1.liga();
		note1.desliga();
		
		note1.capacidadeBateria();
		
		teclado.close();
				

	}

}
