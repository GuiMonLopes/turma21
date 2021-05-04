package exercicios;

import java.util.Scanner;

public class Lista1Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Construa um programa em c que, tendo como dados de entrada 
		 * dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a 
		 * distância entre eles. A fórmula que efetua tal cálculo é:
		 */
	
		Scanner teclado = new Scanner(System.in);
		double x1,x2,y1,y2,dist;
		
		System.out.println("Informe x1: ");
		x1 = teclado.nextDouble();
		System.out.println("Informe y1: ");
		y1 = teclado.nextDouble();
		System.out.println("Informe x2: ");
		x2 = teclado.nextDouble();
		System.out.println("Informe y2: ");
		y2 = teclado.nextDouble();
		
		dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.printf("A distância é %.2f", dist);
		
		teclado.close();
		
	}

}
