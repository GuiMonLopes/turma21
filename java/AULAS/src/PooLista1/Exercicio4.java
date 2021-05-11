package PooLista1;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*
		 * Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
		 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as 
		 * informa��es deste objeto no console.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario1 = new Funcionario("Guilherme",1,2010);
		
		
		System.out.print("Insira o ano de nascimento do funcionario: ");
		funcionario1.anoNascimento = sc.nextInt();
		System.out.print("Insira o genero do funcionario (F/M/O): ");
		funcionario1.genero = sc.next().toUpperCase().charAt(0);
		System.out.print("O funcionario est� ativo? (1 - Sim / 2 - N�o): ");
		funcionario1.verificarStatus(sc.next().charAt(0));
		
		System.out.println();
		System.out.println("Nome do Funcionario: " + funcionario1.nome);
		System.out.println("Genero: " + funcionario1.genero);
		funcionario1.imprimirStatus();
		funcionario1.tempoDeEmpresa();
		
	sc.close();
	
		

	}

}
