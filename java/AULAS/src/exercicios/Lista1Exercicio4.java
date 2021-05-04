package exercicios;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double numA, numB, numC, result;
		
		System.out.println("Informe o número A: ");
		numA = teclado.nextInt();
		System.out.println("Informe o número B: ");
		numB = teclado.nextInt();
		System.out.println("Informe o número C: ");
		numC = teclado.nextInt();
		
		result =((Math.pow(numA+numB,2))+(Math.pow(numB+numC,2)))/2;
		
		System.out.printf("O resultado: %.2f", result);
		
		teclado.close();	
		
	}

}
