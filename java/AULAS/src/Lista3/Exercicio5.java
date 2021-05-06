package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero.
		 *  No final, mostre a soma dos n�meros digitados.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num=0, soma = 0;
		
		do
		{
			System.out.println("Informe um n�mero: ");
			num = teclado.nextInt();
			
			soma+=num;
			
		}while(num!=0);
		
		System.out.println(soma);
		

	}

}
