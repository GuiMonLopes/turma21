package programas;

import java.util.Locale;
import java.util.Scanner;

import classes.Basico;
import classes.Graduacao;
import classes.Medio;
import classes.Mestrado;
import classes.Pos;

public class ProgramaEscola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);

		final int rodada = 3;
		int numero;
		double pontos = 0.0;
		char nota, continuar, pediBoletim;

		String tipo[] = { "Básico", "MÉDIO", "GRADUAÇÃO", "PÓS", "MESTRADO" };

		System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
		System.out.println("-----------------------------------");
		System.out.println("1 - Básico\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
		System.out.println("Digite o código da opção selecionada: ");
		numero = teclado.nextInt();

		switch (numero) {

		case 1: {
			Basico alunoBasico = new Basico(1, "111", 11);

			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("Ensino: " + tipo[numero - 1]);
			System.out.println("Matricula: " + alunoBasico.getMatricula());
			System.out.println("CPF: " + alunoBasico.getCpf());
			if (alunoBasico.isStatus() == true) {
				System.out.println("Status: 1 - Ativo");
			} else {
				System.out.println("Status: 2 - Inativo");
			}
			System.out.println("-----------------------------------");
			for (int i = 0; i < rodada; i++) {

				System.out.printf("\nTotal de nota: %.2f", alunoBasico.getPontos());
				System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
				nota = teclado.next().toUpperCase().charAt(0);
				System.out.println("Valor do movimento: ");
				pontos = teclado.nextDouble();
				if (nota == 'I') {
					alunoBasico.adicionarNota(pontos);
					alunoBasico.bonusAniversario(pontos);
				} else if (nota == 'R') {

					alunoBasico.retirarNota(pontos);
				}
				System.out.println("Deseja continuar S/N: ");
				continuar = teclado.next().toUpperCase().charAt(0);

				if (continuar == 'N') {
					break;
				}
				System.out.println("Fim do Programa.");

			}

			break;
		}
		case 2: {
			Medio alunoMedio = new Medio(1, "111.111.111-11", true);

			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("Ensino: " + tipo[numero - 1]);
			System.out.println("Matricula: " + alunoMedio.getMatricula());
			System.out.println("CPF: " + alunoMedio.getCpf());
			if (alunoMedio.isStatus() == true) {
				System.out.println("Status: 1 - Ativo");
			} else {
				System.out.println("Status: 2 - Inativo");
			}

			System.out.println("-----------------------------------");
			for (int i = 0; i < rodada; i++) {
				do {
					System.out.printf("\nTotal de nota: %.2f", alunoMedio.getPontos());
					System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
					nota = teclado.next().toUpperCase().charAt(0);
					System.out.println("Valor do movimento: ");
					pontos = teclado.nextDouble();
					if (pontos > alunoMedio.getPontos() && nota == 'R') {
						System.out.printf("A nota ficará negativa. Total de pontos %.2f.", alunoMedio.getPontos());
					}
				} while (pontos > alunoMedio.getPontos() && nota == 'R');

				if (nota == 'I') {
					alunoMedio.adicionarNota(pontos);
				} else if (nota == 'R') {

					alunoMedio.retirarNota(pontos);
				}
				System.out.println("Deseja continuar S/N: ");
				continuar = teclado.next().toUpperCase().charAt(0);

				if (continuar == 'N') {
					break;
				}
			}

			System.out.println("Deseja imprimir S/N: ");
			pediBoletim = teclado.next().toUpperCase().charAt(0);
			alunoMedio.pediBoletim(pediBoletim);

			break;
		}
		case 3: {
			Graduacao alunoGraduacao = new Graduacao(1, "111");
			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("Ensino: " + tipo[numero - 1]);
			System.out.println("Matricula: " + alunoGraduacao.getMatricula());
			System.out.println("CPF: " + alunoGraduacao.getCpf());
			if (alunoGraduacao.isStatus() == true) {
				System.out.println("Status: 1 - Ativo");
			} else {
				System.out.println("Status: 2 - Inativo");
			}

			System.out.println("-----------------------------------");
			for (int i = 0; i < rodada; i++) {

				System.out.printf("\nTotal de nota: %.2f", alunoGraduacao.getPontos());
				System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
				nota = teclado.next().toUpperCase().charAt(0);
				System.out.println("Valor do movimento: ");
				pontos = teclado.nextDouble();
				if (nota == 'I') {
					alunoGraduacao.adicionarNota(pontos);
				} else if (nota == 'R') {

					alunoGraduacao.retirarNota(pontos);
				}
				System.out.println("Deseja continuar S/N: ");
				continuar = teclado.next().toUpperCase().charAt(0);

				if (continuar == 'N') {
					break;
				}
				System.out.println("Fim do Programa.");

			}

			break;
		}
		case 4: {
			Pos alunoPos = new Pos(1, "111", 5);
			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("Ensino: " + tipo[numero - 1]);
			System.out.println("Matricula: " + alunoPos.getMatricula());
			System.out.println("CPF: " + alunoPos.getCpf());
			if (alunoPos.isStatus() == true) {
				System.out.println("Status: 1 - Ativo");
			} else {
				System.out.println("Status: 2 - Inativo");
			}

			System.out.println("-----------------------------------");
			for (int i = 0; i < rodada; i++) {

				System.out.printf("\nTotal de nota: %.2f", alunoPos.getPontos());
				System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
				nota = teclado.next().toUpperCase().charAt(0);
				System.out.println("Valor do movimento: ");
				pontos = teclado.nextDouble();
				if (nota == 'I') {
					alunoPos.adicionarNota(pontos);
				} else if (nota == 'R') {

					alunoPos.retirarNota(pontos);
				}
				System.out.println("Deseja continuar S/N: ");
				continuar = teclado.next().toUpperCase().charAt(0);

				if (continuar == 'N') {
					break;
				}
				System.out.println("Fim do Programa.");

			}

			break;
		}
		case 5: {
			Mestrado alunoMestrado = new Mestrado(1, "111", 10);
			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("Ensino: " + tipo[numero - 1]);
			System.out.println("Matricula: " + alunoMestrado.getMatricula());
			System.out.println("CPF: " + alunoMestrado.getCpf());
			if (alunoMestrado.isStatus() == true) {
				System.out.println("Status: 1 - Ativo");
			} else {
				System.out.println("Status: 2 - Inativo");
			}

			System.out.println("-----------------------------------");
			for (int i = 0; i < rodada; i++) {

				System.out.printf("\nTotal de nota: %.2f", alunoMestrado.getPontos());
				System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ", i + 1, rodada);
				nota = teclado.next().toUpperCase().charAt(0);
				System.out.println("Valor do movimento: ");
				pontos = teclado.nextDouble();
				if (nota == 'I') {
					alunoMestrado.adicionarNota(pontos);
				} else if (nota == 'R') {

					alunoMestrado.retirarNota(pontos);
				}
				System.out.println("Deseja continuar S/N: ");
				continuar = teclado.next().toUpperCase().charAt(0);

				if (continuar == 'N') {
					break;
				}
				System.out.println("Fim do Programa.");

			}

			break;
		}
		case 6: {
			System.out.println("Fim do programa!");
			break;
		}
		default: {
			System.out.println("Opção Inválida!");
			break;
		}

		}

		teclado.close();

	}

}
