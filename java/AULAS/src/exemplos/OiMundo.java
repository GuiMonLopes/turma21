package exemplos;

import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		//instanciar = criar um teclado
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int num1=10, num2=30, num3, num4;
		double salario=1999.25;
		char op = 'S';
		
		
		
		System.out.println("Oi mundo");
		System.out.println("Guilherme Monteiro Lopes");
		System.out.printf("A soma é %d\n",(num1+num2));
		
		System.out.println("Informe o nome: ");
		nome = leia.next();
		System.out.println("Informe o numero3: ");
		num3 = leia.nextInt();
		System.out.println("Informe o numero4: ");
		num4 = leia.nextInt();
		System.out.printf("A soma é: %d\n",(num3+num4));
		System.out.println("Informe o salario: ");
		salario = leia.nextDouble();
		
	}

}
