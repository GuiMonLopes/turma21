package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Uma empresa desenvolveu uma pesquisa para saber as características
		 *  psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		 *   era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		 *    e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		 *     Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
		 *  o número de pessoas calmas; 
		 *  o número de mulheres nervosas;
		 *  o número de homens agressivos; 
		 *  o número de outros calmos;
		 *  o número de pessoas nervosas com mais de 40 anos;
		 *  o número de pessoas calmas com menos de 18 anos.
		 *     
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int contator=0, idade, personalidade, genero; 
		int mulherCalma = 0, mulherNervosa=0, mulherAgressiva=0;
		int nervosasMaiores=0, calmasMenores=0;
		int homemCalmo=0, homemNervoso=0, homemAgressivo=0;
		int outrosCalmo=0, outrosNervoso=0, outrosAgressivo=0;
		int somaCalmos=0, somaNervosos=0, somaAgressivos=0;
		
		while(contator<150)
		{
			
			System.out.println("Informe a idade: ");
			idade = teclado.nextInt();
			System.out.println("Informe o genero (1-Feminino / 2-Masculino / 3-Outros): ");
			genero = teclado.nextInt();
			System.out.println("Informe a personalidade (1 - Calma / 2 - Nervosa  / 3 - Agressiva): ");
			personalidade = teclado.nextInt();
			
			if(genero==1)//Feminino
			{
				if(personalidade==1)//calma
				{
					mulherCalma++;
					if(idade<=18)
					{
						calmasMenores++;
					}
				}
				else if(personalidade==2)//Nervosa
				{
					mulherNervosa++;
					if(idade>=40)
					{
						nervosasMaiores++;
					}
				}
				else if (personalidade==3)//Agressiva
				{
					mulherAgressiva++;
				}
								
			}
			else if (genero==2)//masculino
			{
				if(personalidade==1)//calma
				{
					homemCalmo++;
					if(idade<=18)
					{
						calmasMenores++;
					}
				}
				else if(personalidade==2)//Nervosa
				{
					homemNervoso++;
					if(idade>=40)
					{
						nervosasMaiores++;
					}
				}
				else if (personalidade==3)//Agressiva
				{
					homemAgressivo++;
				}
				
			}
			else if (genero==3)//outros
			{
				if(personalidade==1)//calma
				{
					outrosCalmo++;
					if(idade<=18)
					{
						calmasMenores++;
					}
				}
				else if(personalidade==2)//Nervosa
				{
					outrosNervoso++;
					if(idade>=40)
					{
						nervosasMaiores++;
					}
				}
				else if (personalidade==3)//Agressiva
				{
					outrosAgressivo++;
				}			
			}
			
			contator++;
		}

		somaCalmos = outrosCalmo + homemCalmo + mulherCalma;
		somaNervosos = outrosNervoso + homemNervoso + mulherNervosa;
		somaAgressivos = outrosAgressivo + homemAgressivo + mulherAgressiva;
		
		System.out.printf("\nQuantidade de pessoas calmas: %d",somaCalmos);
		System.out.printf("\nQuantidade de mulheres nervosas: %d",mulherNervosa);
		System.out.printf("\nQuantidade de homens agressivos: %d",homemAgressivo);
		System.out.printf("\nQuantidade de outros calmos: %d",outrosCalmo);
		System.out.printf("\nQuantidade de pessoas com mais de 40 nervosas: %d",nervosasMaiores);
		System.out.printf("\nQuantidade de pessoas com menos de 18 calmas: %d",calmasMenores);
		
		teclado.close();
		
	}	

}
