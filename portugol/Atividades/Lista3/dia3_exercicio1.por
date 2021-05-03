programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		//NOME: dia3_exercicio1
 		//Objetivo: Salario e filhos Prefeitura
 		//inicio
 			//Variaveis
 			const inteiro vezes=20
 			real salario,soma_salario=0.00, media_salario, maior=0.00,cont_salario=0.00,filho,soma_filho=0.00, media_filho
 
 			//Entradas
 			para(inteiro i = 0; i<vezes; i++)g
 			{
 				escreva("Informe o salário ",i+1,"/",vezes,": ")
 				leia(salario)
 				escreva("Informe o número de filhos ",i+1,"/",vezes,": ")
 				leia(filho)

				soma_salario += salario
 				soma_filho +=filho
 					se(salario>maior)
 					{
 						maior = salario
 					}
 					se(salario <=100.00)
 					{
 						cont_salario++
 					}
 			}
 			limpa()
 			media_salario = mat.arredondar((soma_salario/vezes),2)
 			escreva("\nA media dos salarios é de R$ ",media_salario)
 			media_filho = (soma_filho/vezes)
 			escreva("\nA media dos filhos é de ",mat.arredondar(media_filho,2))
 			escreva("\nO maior salario é de R$ ",mat.arredondar(maior, 2))
 			escreva("\nA percentual de salario menores de R$ 100.00 é: ",mat.arredondar(((cont_salario/vezes)*100),2),"%")
 			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */