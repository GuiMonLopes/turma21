package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSeIR {

	public static void main(String[] args) {
		/*
		 * nome do contribuinte
			masculino, feminino, outro - M/F/O
			emergencial SIM/NÃO - true/false
			salario bruto -
			se a soma do salario bruto anual foi acima de 60 mil paga IR por faixa
			senão é isento/isenta/isente
			se é isento e usou o emergencial - não é  fraude - vc tem direito a mais um emergencial
			acima de 5000 até 6000 - 15%
			6000 e 10000 - 17%
			acima de 10.000 25%
			se pegou o emergencial - fraude  - devolva o valor - 600 * 5
			devolva o valor
		 */
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		char genero, emergencial;
		boolean auxilio;
		double salario, salarioAnual, imposto = 0.00;
		
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		System.out.println("Informe o gênero (M/F/O): ");
		genero = teclado.next().toUpperCase().charAt(0);
		System.out.println("Recebou o emergencial? S/N");
		emergencial = teclado.next().toUpperCase().charAt(0);
		System.out.println("Informe o salario bruto mensal: ");
		salario = teclado.nextDouble();
		
		salarioAnual = salario * 12;
		
		if(emergencial == 'S') {
			auxilio = true;
		}else {
			auxilio = false;
		}
		
		
		if(salarioAnual >= 60000.00) {
			System.out.println("Enquadra-se no IR.");
			if(salario >= 5000.00 && salario <=6000.00){
				imposto = salarioAnual * 0.15;
				System.out.printf("Valor do imposto em cima do salario é de R$ %.2f\n",imposto);
			}else if (salario > 6000.00 && salario <=10000.00) {
				imposto = salarioAnual * 0.17;
				System.out.printf("Valor do imposto em cima do salario é de R$ %.2f\n",imposto);
			}else if(salario > 10000.00) {
				imposto = salarioAnual * 0.25;
				System.out.printf("Valor do imposto em cima do salario é de R$ %.2f\n",imposto);
			}
			
			if(auxilio) {
				System.out.printf("Fraude. Devolver o valor: R$ 3000.00\n");
				System.out.printf("Imposto total a pagar: R$ %.2f\n", imposto+=3000);
			}else {
				System.out.println("Não recebeu o emergencial.");
			}
			
		}else {
			
			if(genero == 'M') {
				System.out.println("Você é isento.");
			}else if(genero == 'F' ) {
				System.out.println("Você é isenta.");
			}else if(genero == 'O') {
				System.out.println("Você é isente.");
			}
			
			if(auxilio) {
				System.out.println("Pode receber a nova rodade do auxilio.");
			}else {
				System.out.println("Não solicitou o auxilio.");
			}
			
		}
		
	}

}
