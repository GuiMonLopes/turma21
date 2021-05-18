package entidades;

public class Terceiro extends Funcionariio {
	

	private double adicional;

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double salarioHora, double adicional) {
		super(matricula, nome, horasTrabalhadas, salarioHora);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public double salario(){
        
        return (horasTrabalhadas* salarioHora)+adicional;
    }
	

	@Override
	public String toString() {
		return "Terceiro [matricula=" + matricula + ", nome=" + nome
				+ ", horasTrabalhadas=" + horasTrabalhadas + ", salarioHora=" + salarioHora + " + adicional= "+ adicional+"]";
	}

	
	
	


}
