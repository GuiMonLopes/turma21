package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5.
		 */
		
		Locale.setDefault(Locale.US);

	
		
		for(int num=1000; num<=1999; num++) 
		{
			
			if((num%11)==5)
			{
				
				System.out.printf("\nO numero %d deve resto %d.",num, num%11);
				
			}
			
		}
		System.out.println("\nFim do programa");
	}

}
