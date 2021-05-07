package Lista4;

import java.util.Locale;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela
		 * possui.
		 * 
		 */

		Locale.setDefault(Locale.US);

		Random gerador = new Random();
		int matriz[][] = new int[3][3];
		int contador = 0;

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				matriz[l][c] = gerador.nextInt(50);
			}
		}
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (matriz[l][c] > 10) {
					contador++;
				}
			}
		}
		System.out.println("\nA matriz ficou:");
		for (int l = 0; l < 3; l++) {
			System.out.println();
			for (int c = 0; c < 3; c++) {
				System.out.printf("%d\t", matriz[l][c]);
			}
		}
		System.out.println("\nA quantidade de numeros maiores de 10 é: " + contador);

	}

}
