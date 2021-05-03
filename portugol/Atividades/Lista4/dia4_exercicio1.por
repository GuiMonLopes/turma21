programa
{
	
	funcao inicio()
	{
		const inteiro qtde = 5
		real pont[qtde], maior=0.00

		para(inteiro i=0; i<qtde; i++)
		{
			escreva("Informe o numero ",i+1,"/",qtde,": ")
			leia(pont[i])
			se(pont[i] > maior)
			{
				maior = pont[i]
			}
		}
		para(inteiro i=0; i<qtde; i++)
		{
			escreva("\nO numero ",i+1,"/",qtde,": ",pont[i])
		}
		escreva("\nO maior numero é :",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */