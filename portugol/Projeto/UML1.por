programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Calendario --> cal
	
	
	funcao inicio()
	{	const inteiro qtde_total = 3, rodada = 3
		inteiro matricula=1, numero=0,qtde_mes[12], mes[12], mes_atual = cal.mes_atual()
		cadeia cpf="000.000.000-00" , tipo[]={"Básico","MÉDIO","GRADUAÇÃO","PÓS","MESTRADO"}
		real pontos, soma_pontos = 0.00
		logico status=verdadeiro
		caracter nota,continuar, pediBoletim
		


		escreva("EducaNorte\nEnsinar é o nosso forte\n")
		escreva("\n-----------------------------------\n")
		escreva("\n1 - Básico\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n")
		escreva("Digite o código da opção selecionada: ")
		leia(numero)
		escolha(numero)
		{
			caso 1:
			
		     
			pare
			caso 2:
			limpa()
				escreva("EducaNorte\nEnsinar é o nosso forte\n")
		     	escreva("\n-----------------------------------\n")
		     	escreva("\nEnsino: ",tipo[numero-1])
		     	escreva("\nMatricula: ",matricula)
		     	escreva("\nCPF: ",cpf)
		     	se(status==verdadeiro)
		     	{
		     		escreva("\nStatus: 1 - Ativo")
		     	}
		     	senao
		     	{
		     		escreva("\nStatus: 2 - Inativo")
		     	}
		     	escreva("\n-----------------------------------\n")
		     	para(inteiro i = 0; i<rodada;i++)
		     	{
		     		escreva("\nTotal de nota: ",mat.arredondar(soma_pontos, 2))
		     		escreva("\nMovimento ",i+1,"/",rodada,": I-Incluir Nota ou R-Retirar nota: ")
		     		leia(nota)
		     		escreva("\nValor do movimento: ")
		     		leia(pontos)
		     		se(nota == 'I' ou nota=='i')
		     		{
		     			soma_pontos+=pontos
		     		}
		     		senao se(nota == 'R' ou nota=='r')
		     		{
		     			soma_pontos-=pontos
		     		}
		     		
		     		escreva("\nDeseja continuar S/N: ")
		     		leia(continuar)
		     		se(continuar =='S' ou continuar=='s')
		     		{
		     			limpa()
		     		}
		     		se(continuar =='N' ou continuar=='n')
		     		{
		     			limpa()
		     			escreva("Deseja imprimir S/N: ")
		     			leia(pediBoletim)
		     			se(pediBoletim =='S' ou pediBoletim=='s' e qtde_mes[mes_atual-1]<=qtde_total)
		     			{
		     				qtde_mes[mes_atual-1]++
		     				escreva("Impressão do Boletim ",qtde_mes[mes_atual-1],"/",qtde_total,".")
		     				escreva("\nTotal de nota: ",mat.arredondar(soma_pontos, 2))
		     				pare
		     			}
		     			se(pediBoletim =='N' ou pediBoletim=='n')
		     			{
		     				escreva("Quantidade de impressões no mês: ", qtde_total - qtde_mes[mes_atual-1])
		     				pare
		     			}
		     		}
		     		se(i == rodada - 1)
		     		{
		     			se(soma_pontos<0)
		     			{
		     				escreva("Pontuação negativa. Favor informar as notas novamente")
		     				pare
		     			}
		     			escreva("Deseja imprimir S/N: ")
		     			leia(pediBoletim)
		     			se(pediBoletim =='S' ou pediBoletim=='s' e qtde_mes[mes_atual-1]<=qtde_total)
		     			{
		     				qtde_mes[mes_atual-1]++
		     				escreva("Impressão do Boletim ",qtde_mes[mes_atual-1],"/",qtde_total,".")
		     				escreva("\nTotal de nota: ",mat.arredondar(soma_pontos, 2))
		     				pare
		     			}
		     			se(pediBoletim =='N' ou pediBoletim=='n')
		     			{
		     				escreva("Quantidade de impressões no mês: ", qtde_total - qtde_mes[mes_atual-1])
		     				pare
		     			}
		     		}
		    		}
		    		
			pare
			
			caso 3:
			pare
			caso 4:
			pare
			caso 5:
			pare
			caso 6:
			escreva("Opção sair solicitada. Sistema desligado.")
			pare
			caso contrario:
			escreva("Opção inválida. Sistema desligado.")
			pare
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2637; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */