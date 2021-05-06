package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: 
		 * Total de pessoas com menos de 21 anos. 
		 * Total de pessoas com mais de 50 anos. 
		 * O programa termina quando idade for =-99.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int idade=0, somaMenor=0, somaMaior = 0;
		
		while(idade != -99)
		{
			System.out.println("Informe a idade: ");
			idade = teclado.nextInt();
			
			if(idade >0 && idade<=21) 
			{
				somaMenor++;
			}
			else if (idade>= 50) 
			{
				somaMaior++;
			}
		}
		
		System.out.printf("\nA quantidade de pessoas menores de 21 anos é %d e a quantidade de pessoa maiores de 50 anos é %d.", somaMenor, somaMaior);
		
	}

}
