programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia2_exercicio7
 		//Objetivo: Calcular area do triangulo
 		//inicio
 			//Variaveis
 			real base, altura, area
 			//Entradas
 				escreva("Informe o valor da base em centimetros: ")
 				leia(base)
 				escreva("Informe o valor da altura em centimetros: ")
 				leia(altura)
 			//processamentos
 			se(base>0 e altura>0)
 			{
 				area = mat.arredondar(((base*altura)/2),2)
 				escreva("A area do triangulo é ",area,"cm²")
 			}
 			senao
 			{
 				escreva("Valores invalidos.")
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