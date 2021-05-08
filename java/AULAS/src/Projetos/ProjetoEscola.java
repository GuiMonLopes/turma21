package Projetos;

import java.util.Locale;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ProjetoEscola {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();

		final int qtdeTotalBoletim = 3, rodada = 3;
		int matricula = 1, numero;
		int qtdeMes[] = new int[12];
		int mesAtual = gc.get(Calendar.MONTH);
		String cpf = "000.000.000-00";
		String tipo[] = { "Básico", "MÉDIO", "GRADUAÇÃO", "PÓS", "MESTRADO" };
		double pontos, somaPontos = 0.00;
		boolean status = true;
		char nota, continuar, pediBoletim;

		do {

			System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
			System.out.println("-----------------------------------");
			System.out.println("1 - Básico\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR");
			System.out.println("Digite o código da opção selecionada: ");
			numero = teclado.nextInt();
			switch (numero){

			case 1: {
				
				break;
			}
			case 2: {
				somaPontos=0;
				System.out.println("\nEducaNorte\nEnsinar é o nosso forte");
				System.out.println("-----------------------------------");
				System.out.println("Ensino: "+tipo[numero-1]);
				System.out.println("Matricula: "+matricula);
				System.out.println("CPF: "+cpf);
		     	if(status==true)
		     	{
		     		System.out.println("Status: 1 - Ativo");
		     	}
		     	else
		     	{
		     		System.out.println("Status: 2 - Inativo");
		     	}
		     	System.out.println("-----------------------------------");
		     	for(int i=0; i<rodada;i++){
		     		System.out.printf("\nTotal de nota: %.2f",somaPontos);
		     		System.out.printf("\nMovimento %d/%d: I-Incluir Nota ou R-Retirar nota: ",i+1,rodada);
		     		nota = teclado.next().toUpperCase().charAt(0);
		     		System.out.println("Valor do movimento: ");
		     		pontos = teclado.nextDouble();
		     		
		     		if(nota == 'I')
		     		{
		     			somaPontos+=pontos;
		     		}
		     		else if(nota == 'R')
		     		{
		     			somaPontos-=pontos;
		     		}
		     		System.out.println("Deseja continuar S/N: ");
		     		continuar = teclado.next().toUpperCase().charAt(0);
		     		
		     		if(continuar == 'N'){
		     			System.out.println("Deseja imprimir S/N: ");
		     			pediBoletim = teclado.next().toUpperCase().charAt(0);
		     			if(pediBoletim=='S' && qtdeMes[mesAtual-1]<qtdeTotalBoletim) {
		     				qtdeMes[mesAtual-1]++;
		     				System.out.printf("\nImpressão do Boletim %d/%d ",qtdeMes[mesAtual-1],qtdeTotalBoletim);
		     				System.out.printf("\nTotal de nota: %.2f",somaPontos);
		     				break;
		     			}
		     			else
		     			{
		     				System.out.printf("Quantidade de impressões no mês: %d", qtdeTotalBoletim - qtdeMes[mesAtual-1]);
		     				break;
		     			}
		     		}
		     		if(i==rodada-1 && continuar=='S'){
		     			if(somaPontos<0){
		     				System.out.println("Pontuação negativa. Favor informar as notas novamente");		     				
		     			}
		     			System.out.println("Deseja imprimir S/N: ");
		     			pediBoletim = teclado.next().toUpperCase().charAt(0);
		     			if(pediBoletim =='S' && qtdeMes[mesAtual-1]<qtdeTotalBoletim) {
		     				qtdeMes[mesAtual-1]++;
		     				System.out.printf("\nImpressão do Boletim %d/%d ",qtdeMes[mesAtual-1],qtdeTotalBoletim);
		     				System.out.printf("\nTotal de nota: %.2f",somaPontos);
		     				break;
		     			}
		     			else
		     			{
		     				System.out.printf("Quantidade de impressões no mês: %d", qtdeTotalBoletim - qtdeMes[mesAtual-1]);
		     				break;
		     			}	     			
		     		}		     			
		     		
		     	}
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
				break;
			}
			default:
				break;
			}

		} while (numero != 6);

	}

}
