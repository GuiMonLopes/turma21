package programas;

import java.util.Locale;
import java.util.Scanner;

import classes.Medio;

public class ProgramaEscola {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		final int rodada = 3;
		int numero;
		double pontos =0.0;
		char nota,continuar,pediBoletim;
		
		String tipo[] = { "B�sico", "M�DIO", "GRADUA��O", "P�S", "MESTRADO" };
		
		
		System.out.println("\nEducaNorte\nEnsinar � o nosso forte");
		System.out.println("-----------------------------------");
		System.out.println("1 - B�sico\n2 - M�DIO\n3 - GRADUA��O\n4 - P�S\n5 - MESTRADO\n6 - SAIR");
		System.out.println("Digite o c�digo da op��o selecionada: ");
		numero = teclado.nextInt();
		
		switch (numero) {
		
		case 1: {
		

			break;
		}
		case 2: {
			Medio alunoMedio = new Medio(1, "111.111.111-11",true);
			
			System.out.println("\nEducaNorte\nEnsinar � o nosso forte");
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
					if(pontos>alunoMedio.getPontos() && nota == 'R') {
						System.out.printf("A nota ficar� negativa. Total de pontos %.2f.",alunoMedio.getPontos());
					}
				}while(pontos>alunoMedio.getPontos() && nota == 'R');
				
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
			

			break;
		}
		case 4: {

			break;
		}
		case 5: {
	
			break;
		}
		case 6: {
			System.out.println("Fim do programa!");
			break;
		}
		default: {
			System.out.println("Op��o Inv�lida!");
			break;
		}

		
		}

	}

}
