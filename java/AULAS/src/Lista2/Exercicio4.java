package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	/*
	 * Faça um programa em que permita a entrada de um número qualquer e 
	 * exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; 
	 * se for ímpar exiba o número elevado ao quadrado.
	 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double num, raiz, pot;
		
		
		System.out.println("Informe um numero: ");
		num = teclado.nextDouble();
		
		if(num>0){
			if((num%2)==0) {
				raiz = Math.sqrt(num);
				System.out.printf("O número é %.2f e sua raiz quadrada é de %.2f\n", num, raiz);
			}else {
				pot = Math.pow(num,2);
				System.out.printf("O número é %.2f e sua potencia ao quadrado é de %.2f\n", num, pot);
			}
		}else {
			System.out.printf("O numero é negativo.");
		}
		teclado.close();
	}

}
