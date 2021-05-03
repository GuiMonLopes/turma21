programa
{
	
	funcao inicio()
	{
		inteiro num1 

		escreva("Informe um numero inteiro: ")
		leia(num1)

	
	se (num1>=0)
	{
		se((num1%2) == 0)
		{
			escreva("O número ",num1," é par e positivo!")
		}
		senao{
			escreva("O número ",num1," é ímpar e positivo!")
			}
	}
	senao
	{
		se((num1%2)==0){

			escreva("O número ",num1," é par e negativo!")
		}
		senao
		{
			escreva("O número ",num1," é ímpar e negativo!")
	
		}
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 123; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */