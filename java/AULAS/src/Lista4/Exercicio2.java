package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre:
		 * Os n�meros pares digitados;
		 * A soma dos n�meros pares digitados;
		 * Os n�meros �mpares digitados;
		 * A quantidade de n�meros �mpares digitados.
		 * 
		 */

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int vetor[] = new int[6];
		int somaPar=0, somaImpar=0;
		
		for(int i=0; i<vetor.length; i++)
		{
			System.out.printf("\nInforme o n�mero %d/%d: ",i+1,vetor.length);
			vetor[i] = teclado.nextInt();	
		}
		for(int i=0; i<vetor.length; i++)
		{			
			if((vetor[i]%2)==0)
			{
				System.out.printf("\nO numero %d � par.",vetor[i]);
				somaPar+=vetor[i];
			}
			else
			{
				System.out.printf("\nO numero %d � impar.",vetor[i]);
				somaImpar++;
			}			
		}
		
		System.out.println("\nA somatoria do numeros pares �: "+somaPar);
		System.out.println("\nA quantidade de numeros impares �: " + somaImpar);
		
		teclado.close();

	}

}
