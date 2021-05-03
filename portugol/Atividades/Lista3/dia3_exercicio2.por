programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia3_exercicio2
 		//Objetivo: Somar impares multiplos de 3
 		//inicio
 			//Variaveis
 			inteiro soma=0, numero=0
 			
 			//Entradas
 			para(inteiro i = 1; i <= 500 ; i++)
 			{
 				se(numero%2!=0 e numero%3==0)
 				{
 					escreva("\n",numero)
 					soma += numero
 				}
 				numero++
 			}
 			escreva("A soma é: ",soma)
 			//processamentos
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