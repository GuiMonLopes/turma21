programa
{
	inclua biblioteca Util-->ut
	
	funcao inicio()
	{
		caracter opcao
		faca{
			escreva("\nDigite o código da opção \n")
			escreva("\n1 - Básico\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n")
			leia(opcao)
			se(opcao=='1'){
				limpa()
				escreva("Ensino: Basico")
				ut.aguarde(100)
			}
			se(opcao=='2'){
				limpa()
				escreva("Ensino: Médio")
				ut.aguarde(100)
			}
			}
			se(opcao=='3'){
				limpa()
				escreva("Ensino: Graduação")
				ut.aguarde(100)
			}
		}enquanto(verdadeiro)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */