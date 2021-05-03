programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia2_exercicio6
 		//Objetivo: Classificação de Idade
 		//inicio
 			//Variaveis
 			inteiro idade
 			//Entradas
 			escreva("Informe a idade do aluno(a): ")
 			leia(idade)
 			//processamentos
 			se(idade<5)
 			{
 				escreva("Aluno(a) não pode matricular-se")
 			}
 			senao se(idade>=5 e idade<=7)
 			{
 				escreva("Aluno(a) matriculado no Infantil A")
 			}
 			senao se(idade>=8 e idade<11)
 			{
 				escreva("Aluno(a) matriculado no Infantil B")
 			}
 			senao se(idade>=12 e idade<=13)
 			{
 				escreva("Aluno(a) matriculado no Juvenil A")
 			}
 			senao se(idade>=14 e idade<=17)
 			{
 				escreva("Aluno(a) matriculado no Juvenil B")
 			}
 			senao se(idade>=18)
 			{
 				escreva("Aluno(a) matriculado no Adulto")
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