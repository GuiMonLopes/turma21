package exercicios;

import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		/*
		 * O custo ao consumidor de um carro novo � a soma 
		 * do custo de f�brica com a percentagem do distribuidor e dos 
		 * impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor
		 *  seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e 
		 *  escreva o custo ao consumidor. 
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		final double imposto = 1.73;
		double valorFabrica, valorConsumidor;
		
		System.out.println("Informe o custo de f�brica: ");
		valorFabrica = teclado.nextDouble();
		
		valorConsumidor = valorFabrica*imposto;
		
		System.out.printf("O custo para o consumidor � de R$ %.2f", valorConsumidor);
		
		teclado.close();		

	}

}
