package entidades;

public class Funcionariio {
	
	String matricula;
	String nome;
	int horasTrabalhadas;
	double salarioHora;
	
	public Funcionariio(String matricula, String nome, int horasTrabalhadas, double salarioHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.salarioHora = salarioHora;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public void mostrarSalario()
	{
		
		System.out.printf("O seu salario é: %.2f" , horasTrabalhadas* salarioHora);
	}

	@Override
	public String toString() {
		return "Funcionariio [matricula=" + matricula + ", nome=" + nome + ", horasTrabalhadas=" + horasTrabalhadas
				+ ", salarioHora=" + salarioHora + "]";
	}



}
