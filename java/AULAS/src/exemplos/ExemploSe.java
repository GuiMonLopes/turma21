package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		int num;
		System.out.println("Digite o número: ");
		num = teclado.nextInt();
		
		if(num==0) {
			System.out.println("O número é neutro.");
		}else if(num<0) {
			System.out.println("O número é negativo.");
		}else if((num%2)==0) {
			System.out.println("O número é par.");
		}else{
			System.out.println("O número é ímpar.");
		 }
		
		
		teclado.close();
	}

}
