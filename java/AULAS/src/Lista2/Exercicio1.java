package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3, maior=0;
		
		System.out.println("Informe o número 1: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o número 2: ");
		num2 = teclado.nextInt();
		System.out.println("Informe o número 3: ");
		num3 = teclado.nextInt();
		
		if(num1>maior){
			maior = num1;
		}
		if(num2>maior) {
			maior = num2;
		}
		if(num3>maior) {
			maior = num3;
		}
		
		System.out.printf("O numero 1 é: %d\n", num1);
		System.out.printf("O numero 2 é: %d\n", num2);
		System.out.printf("O numero 3 é: %d\n", num3);
		System.out.printf("O maior número é: %d",maior);
 
		teclado.close();
	}

}
