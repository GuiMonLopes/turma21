package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double num, somaPar =0 , somaImpar= 0;
		final int rodada = 10;
		
		for(int i = 1; i<=rodada; i++)
		{
			
			System.out.printf("\nInforme o número %d/%d: ",i,rodada);
			num = teclado.nextDouble();
						
			if((num%2)==0)
			{
				somaPar++;
			}
			else
			{
				somaImpar++;
			}
		}
		
		System.out.printf("\nA quantidade de números pares é %.2f e a quantidade de números ímpares é %.2f", somaPar, somaImpar);

	teclado.close();
	
	}

}
