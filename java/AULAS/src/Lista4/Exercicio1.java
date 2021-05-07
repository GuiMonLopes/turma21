package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros
		 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
		 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
		 * vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e
		 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posi��o 4,
		 * atribuindo a esta posi��o o valor 100. Mostre na tela cada valor do vetor A,
		 * um em cada linha.
		 */
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		int vetorA[] = { 1, 0, 5, -2, 7 };// (a)
		int soma = 0;

		soma = vetorA[0] + vetorA[1] + vetorA[4];// (b)

		System.out.println("A soma � " + soma);// (b)

		vetorA[3] = 100;// (c)

		for (int s : vetorA) {

			System.out.println(s);
		}

		teclado.close();

	}

}
