programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia2_exercicio2
 		//Objetivo: Calculo de salario
 		//inicio
 			//Variaveis
 			real salario, salario_execesso=0.00,codigo, horas_trabalhadas
 			const real horas=50.00, valor_n=10.00, valor_e=20.00
 			//Entradas
 			escreva("Informe o código do funcionario(a): ")
 			leia(codigo)
 			escreva("Informe as horas trabalhadas: ")
 			leia(horas_trabalhadas)
 			//processamentos
 			se(horas_trabalhadas > 50)
 			{
 				salario_execesso = mat.arredondar(((horas_trabalhadas - horas)*valor_e),2)
 				salario = (horas * valor_n)
 				escreva("O salario é de R$ ",salario," e o salario execesso é de R$ ",salario_execesso)
 			}
 			senao
 			{
 				salario = (horas_trabalhadas * valor_n)
 				escreva("O salario é de R$ ",salario," e o salario execesso é de R$ ",salario_execesso)
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