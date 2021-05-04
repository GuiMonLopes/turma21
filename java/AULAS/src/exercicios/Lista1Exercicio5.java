package exercicios;

import java.util.Scanner;

public class Lista1Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e 
		 * calcule a média final deste aluno. Considerar que a
		 *  média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */

		Scanner teclado = new Scanner(System.in);
		
		double nota1, nota2, nota3, media=0;
		
		System.out.println("Informe a nota 1: ");
		nota1 = teclado.nextDouble();
		System.out.println("Informe a nota 2: ");
		nota2 = teclado.nextDouble();
		System.out.println("Informe a nota 3: ");
		nota3 = teclado.nextDouble();
		
		media = (nota1*0.2) + (nota2*0.3) + (nota3*0.5);
		
		System.out.printf("A media é %.2f", media);
		
		teclado.close();
	}

}
