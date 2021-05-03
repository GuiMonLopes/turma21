programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exercicio7_X_Y
 		//Objetivo: Achar X e Y
 		//inicio
 			//Variaveis
 			real n1,n2,n3,n4,n5,n6, X, Y
 			//Entradas
 			escreva("Informe o numero a: ")
 			leia(n1)
 			escreva("Informe o numero b: ")
 			leia(n2)
 			escreva("Informe o numero c: ")
 			leia(n3)
 			escreva("Informe o numero d: ")
 			leia(n4)
 			escreva("Informe o numero e: ")
 			leia(n5)
 			escreva("Informe o numero f: ")
 			leia(n6)
 			//processamentos
 			X = ((n3*n5) - (n2*n6)) / ((n1*n5) - (n2*n4))
 			Y = ((n1*n6) - (n3*n1)) / ((n1*n5) - (n2*n4))
 			//Saida
 			escreva("O valor de X  é:",X)
 			escreva("O valor de Y é: ",Y)
 			//fim
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */