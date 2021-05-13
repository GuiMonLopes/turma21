package principal;

import entidades.Funcionariio;
import entidades.Terceiro;

public class CadFuncionario {
	
	public static void main(String[] args) {
		Funcionariio func1 = new Funcionariio("12A", "Juvenal", 50, 50);
		Terceiro terceiro1 = new Terceiro("12A", "Juvenal", 50, 50,10);
		
		System.out.println(func1);
		func1.mostrarSalario();
		System.out.println(terceiro1);
		terceiro1.mostrarSalario();

	}

}
