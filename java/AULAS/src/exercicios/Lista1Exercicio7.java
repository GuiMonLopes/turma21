package exercicios;

import java.util.Scanner;

public class Lista1Exercicio7 {

	public static void main(String[] args) {
		/*
		 * Um sistema de equa??es lineares do tipo: , pode ser resolvido segundo mostrado abaixo : 
		 * Escreva um sistema que l? os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		double numA, numB, numC, numD, numE,numF, numX, numY;
		
		System.out.println("Informe o n?mero A: ");
		numA = teclado.nextDouble();
		System.out.println("Informe o n?mero B: ");
		numB = teclado.nextDouble();
		System.out.println("Informe o n?mero C: ");
		numC = teclado.nextDouble();
		System.out.println("Informe o n?mero D: ");
		numD = teclado.nextDouble();
		System.out.println("Informe o n?mero E: ");
		numE = teclado.nextDouble();
		System.out.println("Informe o n?mero F: ");
		numF = teclado.nextDouble();
		
		numX = ((numC*numE) - (numB*numF)) / ((numA*numE) - (numB - numD));
		numY = ((numA*numF) - (numC-numD)) / ((numA*numE) - (numB - numD));
		
		System.out.printf("O valor de X ?: %.2f", numX);
		System.out.printf("O valor de Y ?: %.2f", numY);
		
		teclado.close();
		
	}

}
