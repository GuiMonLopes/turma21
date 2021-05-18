package testeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Ferramentas;
import classes.Itens;

public class TesteEstoque {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		char op = ' ';
		
		do {
		System.out.println("CONTROLE DE ESTOQUE");
		System.out.println("-------------");
		System.out.println("1-Cadastro\n2-Remover\n3-Atualizar\n4-Imprimir\n5-Sair");	
		System.out.println("Selecione o opção: ");
		op = teclado.next().charAt(0);
		
		switch(op) {
		
		case '1':{
			Itens.cadastroItens();
			break;
			
		}
		case '2':{
			
		}
		case '3':{
			
		}
		case '4':{
			
		}case '5':{
			System.out.println("Fim do programa");
			break;
			
		}
		
		
		default:{
			System.out.println("Informação incorreta. Fim do programa!");
			break;
		}			
		
		}
		
		}while(op !='5');
		
		teclado.close();
	}

	

}
