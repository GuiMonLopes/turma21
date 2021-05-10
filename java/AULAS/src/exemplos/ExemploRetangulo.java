package exemplos;

import java.util.Scanner;

public class ExemploRetangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		//variaveis
		double base1 = 0.0;
		double altura1 = 0.0;
		double base2 = 0.0;
		double altura2 = 0.0;
		double area1 = 0.0;
		double area2 = 0.0;
		
		System.out.println("Digite a base 1:");
		base1 = leia.nextDouble();
		System.out.println("Digite a altura1 ");
		altura1 = leia.nextDouble();
		System.out.println("Digite a base 2:");
		base2 = leia.nextDouble();
		System.out.println("Digite a altura2 ");
		altura2 = leia.nextDouble();
		
		area1 = base1 * altura1;
		area2 = base2 * altura2;
		
		if(area1 > area2) {
			System.out.printf("O primeiro retângulo é o maior: área 1 = %.0f\n",area1);
		}
		else if (area1 < area2) {
			
			System.out.printf("O segundo retângulo é o maior: área 2 = %.0f\n",area2);
		}
		else {
			System.out.println("Os retângulos săo iguais");
		}

	}

}
