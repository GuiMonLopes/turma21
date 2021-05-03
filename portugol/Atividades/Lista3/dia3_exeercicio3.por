programa
{
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real num=0.00, soma=0.00
		inteiro cont=0


		enquanto (num>=0.00)
		{
			escreva("Informe um numero: ")
			leia(num)
				se(num<0)
				{
					pare
				}
				
			soma+=num
			cont++
						
		}
		escreva("\nA somatoria é: ",soma)
		escreva("\nA media é: ", mat.arredondar((soma/cont),2))
		escreva("\nFoi informado ",cont," números")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 219; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */