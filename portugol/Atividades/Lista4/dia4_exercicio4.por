programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real m1[3][3], soma=0.00, soma_diagonal=0.00

		para(inteiro x=0; x<3; x++)
		{
			para(inteiro y=0;y<3;y++)
			{
				escreva("Informe o valor da  linha ",x," e coluna ",y," da Matriz :")
				leia(m1[x][y])
				soma+=m1[x][y]
				se(x==y)
				{
					soma_diagonal+=m1[x][y]
				}
			}
		}
		escreva("\nA soma dos valores da Matriz é: ",mat.arredondar(soma, 2))
		escreva("\nA soma dos valores da diagonal é: ",mat.arredondar(soma_diagonal, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 527; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */