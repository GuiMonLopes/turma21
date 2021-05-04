package exercicios;

import java.util.Scanner;

public class Lista1Exercicio1 {
	
	public static void main(String[] args) {
		
		/*Faça um sistema que leia a 
		idade de uma pessoa expressa em anos, meses e dias e 
		mostre-a expressa apenas em dias.*/
		
		Scanner teclado = new Scanner(System.in);
		
		int ano, meses, dia, somaDia;
		
		
		System.out.println("Informe a sua idade por anos, mês e dias(ex.:10 anos, 3 meses e 5 dias). Primeiro os anos: ");
		ano = teclado.nextInt();
		System.out.println("Informe a sua idade por anos, mês e dias(ex.:10 anos, 3 meses e 5 dias). Segundo os meses: ");
		meses = teclado.nextInt();
		System.out.println("Informe a sua idade por anos, mês e dias(ex.:10 anos, 3 meses e 5 dias). Terceiro os dias: ");
		dia = teclado.nextInt();
		
		somaDia = (ano*365) + (meses*30) + dia;
		
		System.out.printf("Sua idade em dia: %d", somaDia);
		
		
		teclado.close();
	}
	

}
