package classes;

public class Pos extends Estudante {

	private double credito;

	public Pos(int matricula, String cpf, double credito) {
		super(matricula, cpf);
		this.credito = credito;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	@Override
	public void retirarNota(double pontos) {
		double aux;

		if (super.getPontos() - pontos >= 0) {

			super.retirarNota(pontos);

		} else if (pontos - super.getPontos() <= credito) {
			aux = pontos - super.getPontos();
			credito = credito - aux;
			super.retirarNota(pontos - aux);
			System.out.println("Total de bonus: " + credito);
			System.out.println("Total de pontos: " + super.getPontos());
		} else {
			System.out.println("Não será possviel realizar a operação.");
		}

	}

}
