package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int numero = 233;
				
				
				do 
				{ 
					if(numero >= 300 && numero <=400){

						System.out.printf("%d + 3 = ",numero);
						numero = numero +3;
						System.out.println(numero);
					}
					
					if (numero >=233 && numero <300 || numero >400 && numero < 456)
					{
						System.out.printf( " %d + 5 = ",numero);
						numero = numero +5;
						System.out.println(numero);
						}
						
					
				} while (numero >= 233 && numero<456);
							
		
	}

}
