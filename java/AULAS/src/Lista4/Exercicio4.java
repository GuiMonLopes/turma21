package Lista4;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao
		 * usuário um menu de opções: (1) somar as duas matrizes (2) subtrair a primeira
		 * matriz da segunda (3) adicionar uma constante as duas matrizes (4) imprimir
		 * as matrizes Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser
		 * criada. Na terceira opção o valor da constante deve ser lido e o resultado da
		 * adição da constante deve ser armazenado na própria matriz.
		 */

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		Random gerador = new Random();
		double m1[][] = new double[2][2];
		double m2[][] = new double[2][2];
		double m3[][] = new double[2][2];
		int constante = 0;
		char opcao, opcao2 = 0, continuar = 'S';

		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				m1[l][c] = gerador.nextDouble() * 10;
			}
		}
		for (int l = 0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				m2[l][c] = gerador.nextDouble() * 10;
			}
		}

		do {
			System.out
					.println("\nAs Opções são:\n(1) somar as duas matrizes\n(2) subtrair a primeira matriz da segunda\n"
							+ "(3) adicionar uma constante as duas matrizes\n(4) imprimir as matrizes");
			System.out.println("Informe a opção desejada: ");
			opcao = teclado.next().toUpperCase().charAt(0);

			if (opcao == '1') {
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						m3[l][c] = m1[l][c] + m2[l][c];
					}
				}
				opcao2 = opcao;

			} else if (opcao == '2') {
				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {

						m3[l][c] = m2[l][c] - m1[l][c];
					}
				}
				opcao2 = opcao;
			} else if (opcao == '3') {
				System.out.println("Informe a constante para adicionar nas duas Matrizes: ");
				constante = teclado.nextInt();

				for (int l = 0; l < 2; l++) {
					for (int c = 0; c < 2; c++) {
						m1[l][c] += constante;
						m2[l][c] += constante;
					}
				}
				opcao2 = opcao;
			} else if (opcao == '4') {
				System.out.println("\nA matriz 1 ficou:");
				for (int l = 0; l < 2; l++) {
					System.out.println();
					for (int c = 0; c < 2; c++) {
						System.out.printf("%.2f\t", m1[l][c]);
					}
				}
				System.out.println("\nA matriz 2 ficou:");
				for (int l = 0; l < 2; l++) {
					System.out.println();
					for (int c = 0; c < 2; c++) {
						System.out.printf("%.2f\t", m2[l][c]);
					}
				}

				if (opcao2 != '3') {

					System.out.printf("\nMatriz da opção selecionada anteriormente: %s opção. ", opcao2);
					for (int l = 0; l < 2; l++) {
						System.out.println();
						for (int c = 0; c < 2; c++) {
							System.out.printf("%.2f\t", m3[l][c]);
						}
					}
				}
				break;

			}

			System.out.println("\nDeseja continuar S/N");
			continuar = teclado.next().toUpperCase().charAt(0);

		} while (continuar == 'S');
		
		teclado.close();

	}
}
