programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia2_exercicio5
 		//Objetivo: indice
 		//inicio
 			//Variaveis
 			real indice
 			//Entradas
 			escreva("Informe o indice: ")
 			leia(indice)
 			//processamentos
 			se(indice<0.3)
 			{
 				escreva("O indice está no limite ideal.")
 			}
 			senao se(indice>=0.3 e indice<=0.4)
 			{
 				escreva("Industrias do Grupo 1, favor suspender atividade")
 			}
 			senao se(indice>=0.4 e indice<0.5)
 			{
 				escreva("Industrias do Grupo 1 e 2, favor suspenderem atividades")
 			}
 			senao se(indice>=0.5)
 			{
 				escreva("Industrias do Grupo 1, 2 e 3, favor suspenderem atividades")
 			}
 			//Saida
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