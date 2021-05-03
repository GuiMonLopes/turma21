programa
{
	
	funcao inicio()
	{
		real n1[4][6],n2[4][6],m1[4][6],m2[4][6]

		para(inteiro x=0; x<4; x++)
		{
			para(inteiro y=0;y<6;y++)
			{
				escreva("Informe o numero da  linha ",x," e coluna ",y," da N1 :")
				leia(n1[x][y])
				escreva("Informe o numero da linha ",x," e coluna ",y," da N2 :")
				leia(n2[x][y])
				/*
				 * n1[x][y] = util.sorteia(1,9)
				 * n2[x][y] = util.sorteia(1,9)
				 */
				m1[x][y] = n1[x][y] + n2[x][y]
				m2[x][y] = n1[x][y] - n2[x][y]
			}
		}
		limpa()
		escreva("\nSOMA DAS MATRIZES N1 E N2\n")
		escreva("\n----------------------------\n")
		para(inteiro x=0; x<4; x++)
		{
			para(inteiro y=0;y<6;y++)
			{
				escreva("\t",m1[x][y],"\t")
			}
			escreva("\n")
		}
		escreva("\nDIFERENÇA DAS MATRIZES N1 E N2\n")
		escreva("\n----------------------------\n")
		para(inteiro x=0; x<4; x++)
		{
			para(inteiro y=0;y<6;y++)
			{
				escreva("\t",m2[x][y],"\t")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */