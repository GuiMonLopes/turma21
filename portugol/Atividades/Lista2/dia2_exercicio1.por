programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia2_exercicio1
 		//Objetivo: Peixe
 		//inicio
 			//Variaveis
 			real peso_tomates, execesso =0.00, multa=0.00
 			//Entradas
 			escreva("Informe o peso de tomates: ")
 			leia(peso_tomates)
 			//processamentos
 			se(peso_tomates>50)
 			{
 				execesso = (peso_tomates - 50)
 				multa = mat.arredondar((execesso * 4.00),2)
 				escreva("Houve excesso de peso. Peso total: ",peso_tomates,"kg e peso em execesso: ",execesso,"kg e a multa é de R$ ",multa)
 			}
 			senao
 			{
 				escreva("Não houve execesso. Peso total: ",peso_tomates,"kg e peso em execesso: ",execesso,"kg e a multa é de R$ ",multa)
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