programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio(){
		//NOME: Calcular temperatura °C e °F
 		//Objetivo: Calcular temperatura °C e °F
 		//inicio
 			//Variaveis
 			real temperatura_celsius
 			real temperatura_fahrenheit
 			real arredondamento
 			//Entradas
 			escreva("Informe a temperatura em fahrenheit: ")
 			leia(temperatura_fahrenheit)
 			//processamentos
 			temperatura_celsius = (temperatura_fahrenheit -32)/1.8
 			arredondamento = mat.arredondar(temperatura_celsius, 2)
 			//Saida
 			escreva("A temperatura em celsius é: "+arredondamento)
 			//fim
 	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */