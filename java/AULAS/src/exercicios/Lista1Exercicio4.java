package exercicios;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o:
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double numA, numB, numC, result;
		
		System.out.println("Informe o n�mero A: ");
		numA = teclado.nextInt();
		System.out.println("Informe o n�mero B: ");
		numB = teclado.nextInt();
		System.out.println("Informe o n�mero C: ");
		numC = teclado.nextInt();
		
		result =((Math.pow(numA+numB,2))+(Math.pow(numB+numC,2)))/2;
		
		System.out.printf("O resultado: %.2f", result);
		
		teclado.close();	
		
	}

}
