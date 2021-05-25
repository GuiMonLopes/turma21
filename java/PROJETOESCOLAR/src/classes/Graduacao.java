package classes;

public class Graduacao extends Estudante {
	
	double bonus = 2;

	public Graduacao(int matricula, String cpf) {
		super(matricula, cpf);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public void retirarNota(double pontos) {
		double aux;
		
		if(super.getPontos()-pontos >=0) {
			
			super.retirarNota(pontos);
			
		}else if(pontos - super.getPontos() <= bonus){
			aux = pontos - super.getPontos();
			bonus  = bonus - aux;
			super.retirarNota(pontos - aux);
			System.out.println("Total de bonus: "+bonus);
			System.out.println("Total de pontos: " +super.getPontos());
		}else {
			System.out.println("Não será possviel realizar a operação.");
		}
		
	}

}
