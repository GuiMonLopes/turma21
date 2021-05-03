programa
{
	funcao inicio(){
 		//NOME: calculo aproximado de idade
 		//Objetivo: calcular aproximadamente a idade
 		//inicio
 			//Variaveis
 			const inteiro ano_atual=2021
 			inteiro idade
 			cadeia nome
 			inteiro ano
 			
 			//Entradas
 			escreva("Informe seu Nome: ")
 			leia(nome)
 			escreva("Informe seu ano de nascimento: ")
 			leia(ano)
 			//processamentos
 			idade = ano_atual - ano
 			//Saida
 			escreva("Sua idade aproximada é de : " +idade+" e seu nome é: "+nome)
 			//fim
 	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */