programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exercico3
 		//Objetivo: Tempo de segundos para horas
 		//inicio
 			//Variaveis
 			inteiro segundos_totais, hora, minutos, segundos
 			//Entradas
 			escreva("Informe os segundos: ")
 			leia(segundos_totais)
 			//processamentos
 			hora = segundos_totais/3600
 			minutos = (segundos_totais%3600)/60
 			segundos = (segundos_totais%3600)%60
 			//Saida
 			escreva("O tempo é ",hora,"h",minutos,"m e", segundos,"s")
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