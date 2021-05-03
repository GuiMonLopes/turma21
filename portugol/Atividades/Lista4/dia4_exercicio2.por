programa
{
	
	funcao inicio()
	{
		const inteiro qtde = 10
		const inteiro lado_dado = 6
		inteiro dado[qtde], media=0, cont=0

		para(inteiro i = 0; i<qtde; i++)
		{
			escreva("Informe a jogada ",i+1,"/",qtde," do dado de ",lado_dado,": ")
			leia(dado[i])
			media+=dado[i]
			se(dado[i] == lado_dado)
			{
				cont++
			}
		}
		escreva("\nA média é: ",(media/qtde))
		escreva("\nO total de maior pontuação é: ",cont)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */