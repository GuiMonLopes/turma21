programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exerecicio2
 		//Objetivo: Calcular a idade em ano, mes e dia
 		//inicio
 			//Variaveis
 			inteiro idade_ano, idade_mes, idade_dia, idade_em_dia
 			//Entradas
 			escreva("Informe sua idade em dias: ")
 			leia(idade_em_dia)
 			//processamentos
 			idade_ano = idade_em_dia/365
 			idade_mes = (idade_em_dia%365)/30
 			idade_dia = (idade_em_dia%365)%30
 			//Saida
 			escreva("Sua idade é ",idade_ano,"anos",idade_mes,"meses e", idade_dia,"dias")
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