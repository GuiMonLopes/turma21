programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: Calcular temperatura °C e °F
 		//Objetivo: Calcular temperatura °C e °F
 		//inicio
 			//Variaveis
 			cadeia nome
 			real nota, maior=0.00, media, soma=0.00
 			inteiro cont=0
 			//Entradas
 			para(inteiro x =0; x<5 ; x++){
 			escreva("Informe o nome: ")
 			leia(nome)
 			escreva("A nota do alune: ")
 			leia(nota)
			soma = soma+nota
 			
 				se(nota > maior){
 					maior=nota
 				}
 				se(nota<=5){
 					cont++
 				}
 			}
 			limpa()
 			media = mat.arredondar((soma/5),2)
 			escreva("\nA média dos alunos é: ",media)
 			escreva("\nA maior nota é: ",maior)
 			escreva("\nQuantidades de notas menor ou igual a 5: ",cont)
 			
 			//processamentos
 			//Saida
 			//fim
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 773; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */