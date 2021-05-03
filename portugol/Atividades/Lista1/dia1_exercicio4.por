programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exercicio4
 		//Objetivo: Calcular D
 		//inicio
 			//Variaveis
 			real A,B,C,D, pot1, pot2
 			//Entradas
 			escreva("Informe o A: ")
 			leia(A)
 			escreva("Informe o B: ")
 			leia(B)
 			escreva("Informe o C: ")
 			leia(C)
 			//processamentos
 			pot1 = mat.potencia((A+B), 2.0)
 			pot2 = mat.potencia((B+C), 2.0)
 			D = (pot1+pot2)/2
 			//Saida
 			escreva("O resultado é: ", D)
 			//fim
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 79; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */