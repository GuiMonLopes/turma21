package PooLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
		 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto 
		 * no console.
		 */
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Aviao aviao1=new Aviao();
		
		System.out.println("Informe o modelo do aviao: ");
		aviao1.modelo = teclado.next();
		System.out.println("Informe o fabricante: ");
		aviao1.fabricante= teclado.next();
		System.out.println("Informe o numero de serie: ");
		aviao1.numeroDeSerie = teclado.next();
		System.out.println("Informe a autonomia do modelo em L/km: ");
		aviao1.autonomia = teclado.nextDouble();
		System.out.println("Informe a quantidade de combustivel maximo carregado em L: ");
		aviao1.combustivelMaximo = teclado.nextDouble();
		
		aviao1.autonomiaMaxima();
		
		aviao1.incrementoVelocidade(100);
		System.out.println(aviao1.velocidadeAtual);
		
		teclado.close();

	}

}
