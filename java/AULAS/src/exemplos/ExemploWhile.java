package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numero=0, somatorio=0, media=0, totalValoresLidos=0, qtdVezes=0;

				while (numero >= 0)
				{
					System.out.println("Informe um numero positivo: ");
					numero = teclado.nextInt();

					if (numero>=0)
					{
						totalValoresLidos++;
						somatorio = somatorio + numero;
						
					}else{
						break;
					}

				media = somatorio / totalValoresLidos;
				
				}

				System.out.printf("\nA soma dos valores informados é de: %d ", somatorio);
				System.out.printf("\nA quantidade de vezes que foram informados numeros positivos foi de: %d vezes. ",totalValoresLidos);
				System.out.printf("\nA média dos numeros informados é: %d ", media);
				
			teclado.close();
			}	
		
}