package principal;

import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionariio;
import entidades.Terceiro;

public class CadFuncionario {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		Funcionariio func1 = new Funcionariio("12A", "Juvenal", 50, 50);
		
		
		System.out.println(func1);
		System.out.println("O salario é de : R$ "+func1.salario());
		
		System.out.println("Digite nome: ");
		String nome = teclado.next();
		System.out.println("Digite a matricula: ");
		String matricula = teclado.next();
		System.out.println("Informe horas trabalhadas: ");
		int horaTrabalhada = teclado.nextInt();
		System.out.println("Informe valor da hora: ");
		double valorHora = teclado.nextDouble();
		System.out.println("Informe o adicional: ");
		double adicional = teclado.nextDouble();
		
		Terceiro terceiro1 = new Terceiro(matricula, nome, horaTrabalhada, valorHora,adicional);
		System.out.println(terceiro1);
		System.out.println("O salario é de : R$ "+terceiro1.salario());
		
		teclado.close();

	}

}
