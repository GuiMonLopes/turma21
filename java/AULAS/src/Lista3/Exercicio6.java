package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * Escrever um programa que receba vários números inteiros no teclado. 
		 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num=0, soma = 0, media = 0, contator=0;
		
		do
		{
			System.out.println("Informe um número: ");
			num = teclado.nextInt();
			
			if((num%3)==0)
			{
				soma+=num;
			}
			
			if(num!=0)
			{
				contator++;
			}
			
			
		}while(num!=0);
		
		media = soma/contator;
		System.out.println(media);

	}

}
