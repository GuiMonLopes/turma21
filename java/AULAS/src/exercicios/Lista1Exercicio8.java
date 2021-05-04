package exercicios;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * O custo ao consumidor de um carro novo é a soma 
		 * do custo de fábrica com a percentagem do distribuidor e dos 
		 * impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor
		 *  seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e 
		 *  escreva o custo ao consumidor. 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		final double imposto = 1.73;
		double valorFabrica, valorConsumidor;
		
		System.out.println("Informe o custo de fábrica: ");
		valorFabrica = teclado.nextDouble();
		
		valorConsumidor = valorFabrica*imposto;
		
		System.out.printf("O custo para o consumidor é de R$ %.2f", valorConsumidor);
		
		teclado.close();		

	}

}
