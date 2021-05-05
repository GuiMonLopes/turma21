package Lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Informe o número 1: ");
		n1 = teclado.nextInt();
		System.out.println("Informe o número 2: ");
		n2 = teclado.nextInt();
		System.out.println("Informe o número 3: ");
		n3 = teclado.nextInt();
		
		 if (n1 <= n2 && n2 <= n3) {
			 System.out.printf("A ordem crescente: %d %d %d\n", n1, n2, n3);
		    }else if (n1 <= n3 && n3 <= n2){
			  System.out.printf("A ordem crescente: %d %d %d\n", n1, n3, n2);
		    }
		  else if (n2 <= n1 && n1 <= n3){
			  System.out.printf("A ordem crescente: %d %d %d\n", n2, n1, n3);
		    }
		  else if (n2 <= n3 && n3 <= n1) {
			  System.out.printf("A ordem crescente: %d %d %d\n", n2, n3, n1);
		    }
		  else if (n3 <= n1 && n1 <= n2) {
			  System.out.printf("A ordem crescente: %d %d %d\n", n3, n1, n2);
		    }
		 // n3 <= n2 && n2 <= n1
		  else{
			  System.out.printf("A ordem crescente: %d %d %d\n", n3, n2, n1);
		    }
		 
		 teclado.close();
		
	}

}
