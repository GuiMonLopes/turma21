programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exercicio8_custo_carro
 		//Objetivo: Calcular o custo carro
 		//inicio
 			//Variaveis
 			real valor_fabrica, valor_consumidor
 			//Entradas
 			escreva("Informe o valor de fabrica do carro: ")
 			leia(valor_fabrica)
 			//processamentos
 			valor_consumidor = mat.arredondar((valor_fabrica*1.73),2)
 			//Saida
 			escreva("O valor consumidor do carro é de R$ ", valor_consumidor)
 			//fim
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */