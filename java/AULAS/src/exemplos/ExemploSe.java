package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o n�mero: ");
		num = teclado.nextInt();
		
		if(num==0) {
			System.out.println("O n�mero � neutro.");
		}else if(num<0) {
			System.out.println("O n�mero � negativo.");
		}else if((num%2)==0) {
			System.out.println("O n�mero � par.");
		}else{
			System.out.println("O n�mero � �mpar.");
		 }
		
		
		teclado.close();
	}

}
