programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exerecicio6_raiz
 		//Objetivo: Calcular raiz e potencia
 		//inicio
 			//Variaveis
 			real x1, y1, x2, y2, pot1, pot2, raiz
 			//Entradas
 			escreva("Informe o x1:")
 			leia(x1)
 			escreva("Informe o y1:")
 			leia(y1)
 			escreva("Informe o x2:")
 			leia(x2)
 			escreva("Informe o y2:")
 			leia(y2)
 			
 			//processamentos
 			pot1 = mat.potencia((x2-x1), 2.0)
 			pot2 = mat.potencia((y2-y1), 2.0)
 			raiz = mat.raiz((pot1+pot2), 2.0)
 			//Saida
 			escreva(raiz)
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