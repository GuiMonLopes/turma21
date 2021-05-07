package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 6 números inteiros e mostre:
		 * Os números pares digitados;
		 * A soma dos números pares digitados;
		 * Os números ímpares digitados;
		 * A quantidade de números ímpares digitados.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[6];
		int somaPar=0, somaImpar=0;
		
		for(int i=0; i<vetor.length; i++)
		{
			System.out.printf("\nInforme o número %d/%d: ",i+1,vetor.length);
			vetor[i] = teclado.nextInt();	
		}
		for(int i=0; i<vetor.length; i++)
		{			
			if((vetor[i]%2)==0)
			{
				System.out.printf("\nO numero %d é par.",vetor[i]);
				somaPar+=vetor[i];
			}
			else
			{
				System.out.printf("\nO numero %d é impar.",vetor[i]);
				somaImpar++;
			}			
		}
		
		System.out.println("\nA somatoria do numeros pares é: "+somaPar);
		System.out.println("\nA quantidade de numeros impares é: " + somaImpar);
		
		teclado.close();

	}

}
