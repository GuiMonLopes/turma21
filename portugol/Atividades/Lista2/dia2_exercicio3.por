programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia2_exercicio3
 		//Objetivo: Quadrados
 		//inicio
 			//Variaveis
 			real n1,n2,n3,n4,q1,q2,q3,q4
 			//Entradas
 			escreva("Informe o numero 1: ")
 			leia(n1)
 			escreva("Informe o numero 2: ")
 			leia(n2)
 			escreva("Informe o numero 3: ")
 			leia(n3)
 			escreva("Informe o numero 4: ")
 			leia(n4)
 			limpa()
 			//processamentos
 			q1 = mat.potencia(n1, 2.0)
 			q2 = mat.potencia(n2, 2.0)
 			q3 = mat.potencia(n3, 2.0)
 			q4 = mat.potencia(n4, 2.0)

 			se(q3 >1000)
 			{
 				escreva("O quadrado do número 3 é: ",q3)
 			}
 			senao
 			{
 				escreva("\nO número ",n1," e seu quadrado: ",q1)
 				escreva("\nO número ",n2," e seu quadrado: ",q2)
 				escreva("\nO número ",n3," e seu quadrado: ",q3)
 				escreva("\nO número ",n4," e seu quadrado: ",q4)
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