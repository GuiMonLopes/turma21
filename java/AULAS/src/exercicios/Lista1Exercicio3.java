package exercicios;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		
		/*Faça um sistema que leia o tempo de duração de 
		 * um evento em uma fábrica expressa em segundos e mostre-o 
		 * expresso em horas, minutos e segundos. 
		 */
		
		
		Scanner teclado = new Scanner(System.in);
		
		int hora, minutos, segundo, segEvento;
		
		System.out.println("Informe os segundos: ");
		segEvento = teclado.nextInt();
		
		hora = (segEvento/3600);
		minutos = (segEvento%3600)/60;
		segundo = (segEvento%60)%60;
		
		System.out.printf("O tempo é de %d horas, %d minutos e %d segundos.", hora, minutos, segundo);
		
		
		teclado.close();
	}

}
