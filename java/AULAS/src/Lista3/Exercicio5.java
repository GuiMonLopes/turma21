package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número igual a zero.
		 *  No final, mostre a soma dos números digitados.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num=0, soma = 0;
		
		do
		{
			System.out.println("Informe um número: ");
			num = teclado.nextInt();
			
			soma+=num;
			
		}while(num!=0);
		
		System.out.println(soma);
		

	}

}
