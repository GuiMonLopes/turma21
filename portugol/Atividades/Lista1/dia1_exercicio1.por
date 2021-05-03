programa
{
	
inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia1_exercicio1
 		//Objetivo: Calcular a idade em dias
 		//inicio
 			//Variaveis
 			real idade_ano, idade_mes, idade_dia, idade_resul
 			//Entradas
 			escreva("\nInforme a sua idade por anos, mês e dias(ex.:10 anos, 3 meses e 5 dias). Primeiro os anos: ")
 			leia(idade_ano)
 			escreva("\nInforme a sua idade por anos, mês e dias(ex.:10 anos, 3 meses e 5 dias). Segundo os meses: ")
 			leia(idade_mes)
 			escreva("\nInforme a sua idade por anos, mês e dias(ex.:10 anos, 3 meses e 5 dias). Terceiro os dias: ")
 			leia(idade_dia)
 			//processamentos
 			idade_resul = (idade_ano*365) + (idade_mes*30) + idade_dia
 			//Saida
 			escreva("Sua idade em dias é: ",idade_resul," dias")
 			//fim
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */