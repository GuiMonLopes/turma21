package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;

public class ProgramaTeste {

	public static void main(String[] args) {
		/*
		 * Programa para testar as classes
		 */
		double nota=0;
		Scanner teclado = new Scanner(System.in);
		
		Estudante aluno1 = new Estudante(1234,"111",true);//instanciamento do objeto
		
		System.out.println(aluno1.getCpf());
		
		System.out.println("Digite nota do aluno: ");
		
		aluno1.adicionarNota(nota = teclado.nextDouble());
		
		System.out.printf(" A matricula: %d e a nota é: %.2f",aluno1.getMatricula(),nota);
		
		
		System.out.println("Informe o nome: ");
        String nome = teclado.next().toUpperCase();
		System.out.println("Digite a matricula: ");
		int matricula = teclado.nextInt();
		
		System.out.println("Digite CPF: ");
		String cpf = teclado.next();
		
		System.out.println("Digite o dia de aniversario: ");
		int dia = teclado.nextInt();
		
		Basico alunoBasico1 = new Basico(matricula,cpf,dia);
		alunoBasico1.setNome(nome);
		System.out.println("Digite a nota: ");
		alunoBasico1.adicionarNota(nota = teclado.nextDouble());
		
		System.out.printf("Aluno: %s, Matricula: %d, Pontos: %.2f",alunoBasico1.getNome(),alunoBasico1.getMatricula(),alunoBasico1.getPontos());
		
		System.out.println("Digite o dia atual: ");
		int diaAtual = teclado.nextInt();
		alunoBasico1.bonusAniversario(diaAtual);
		System.out.printf("Aluno: %s, Matricula: %d, Pontos: %.2f",alunoBasico1.getNome(),alunoBasico1.getMatricula(),alunoBasico1.getPontos());

		
			
		}

}
