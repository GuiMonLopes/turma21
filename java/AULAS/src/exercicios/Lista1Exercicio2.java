package exercicios;

import java.util.Scanner;

public class Lista1Exercicio2 {
	
	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade 
		 * de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int ano, meses, dia, diaIdade;
		
		System.out.println("Informe sua idade em dias: ");
		diaIdade = teclado.nextInt();
		
		ano = (diaIdade/365);
		meses= (diaIdade%365)/30;
		dia = (diaIdade%365)%30;
		
		System.out.printf("Sua idade é %d anos, %d meses e %d dias.",ano,meses,dia);
		
		teclado.close();
		}

}
