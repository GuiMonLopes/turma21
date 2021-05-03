programa
{
	inclua biblioteca Texto

	
	funcao inicio()
	{
		cadeia nome
		caracter genero
		inteiro idade,ano=0

		escreva("Informe seu nome: ")
		leia(nome)
		escreva("Informe seu gênero (M/F/O): ")
		leia(genero)
		escreva("Informe seu ano de nascimento: ")
		leia(ano)

		idade = 2021 - ano
		
		se (idade <= 18)
		{
			se(genero == 'M')
			{
				escreva("O ",nome," tem ",idade," anos e é jovem.")
			}
			se(genero == 'F')
			{
				escreva("A ",nome," tem ",idade," anos e é jovem.")
			}
			se(genero == 'O')
			{
				escreva(nome," tem ",idade," anos e é jovem.")
			}
		}
		senao se(idade >18 e idade <=50)
		{
			se(genero == 'M')
			{
				escreva("O ",nome," tem ",idade," anos e é adulto.")
			}
			se(genero == 'F')
			{
				escreva("A ",nome," tem ",idade," anos e é adulta.")
			}
			se(genero == 'O')
			{
				escreva(nome," tem ",idade," anos e é adulte.")
			}
		
		}
		senao
		{
			se(genero == 'M')
			{
				escreva("O ",nome," tem ",idade," anos e é idoso.")
			}
			se(genero == 'F')
			{
				escreva("A ",nome," tem ",idade," anos e é idosa.")
			}
			se(genero == 'O')
			{
				escreva(nome," tem ",idade," anos e é idose.")
			}
		}
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 300; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */