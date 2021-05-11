package PooLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
	
	/*
	 * Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
	 *  em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto 
	 *  no console
	 */
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Cliente cliente1 = new Cliente();
	
	System.out.print("Insira o nome do cliente: ");
	cliente1.nome = sc.nextLine();
	System.out.print("Insira o ano de nascimento do cliente: ");
	cliente1.anoNascimento = sc.nextInt();
	System.out.print("Insira o genero do cliente (F/M/O): ");
	cliente1.genero = sc.next().toUpperCase().charAt(0);
	System.out.print("O cliente está ativo? (1 - Sim / 2 - Não): ");
	 cliente1.verificarStatus(sc.next().charAt(0));
	
	 	System.out.println();
		System.out.println("Nome do cliente: " + cliente1.nome);
		cliente1.idadeAproximada();
		System.out.println("Genero: " + cliente1.genero);
		cliente1.imprimirStatus();
		
	sc.close();
	
	
	}
}
