package classes;

public class Mestrado extends Estudante{
	
	private double creditoMestrado;

	public Mestrado(int matricula, String cpf, double creditoMestrado) {
		super(matricula, cpf);
		this.creditoMestrado = creditoMestrado;
	}

	public double getCreditoMestrado() {
		return creditoMestrado;
	}

	public void setCreditoMestrado(double creditoMestrado) {
		this.creditoMestrado = creditoMestrado;
	}
	
	@Override
	public void retirarNota(double pontos) {
		double aux;

		if (super.getPontos() - pontos >= 0) {

			super.retirarNota(pontos);

		} else if (pontos - super.getPontos() <= creditoMestrado) {
			aux = pontos - super.getPontos();
			creditoMestrado = creditoMestrado - aux;
			super.retirarNota(pontos - aux);
			System.out.println("Total de bonus: " + creditoMestrado);
			System.out.println("Total de pontos: " + super.getPontos());
		} else {
			System.out.println("Não será possviel realizar a operação.");
		}

	}

}
