programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exercicio5
 		//Objetivo: Média de 3 notas
 		//inicio
 			//Variaveis
 			real n1, n2, n3, media, arredondamento
 			//Entradas
 			escreva("A nota 1 é: ")
 			leia(n1)
 			escreva("A nota 2 é: ")
 			leia(n2)
 			escreva("A nota 3 é: ")
 			leia(n3)
 			//processamentos

 			media = (n1*0.2)+(n2*0.3)+(n3*0.5)
 			arredondamento = mat.arredondar(media, 2)
 			
 			//Saida
 			escreva(arredondamento)
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