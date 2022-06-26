package entities;

public class PessoaJuridica extends Contribuinte{

	private int numeroDeFuncionarios;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String name, Double rendaAnual, int numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public double impostoArrecadado() {
		double impostoArrecadado = 0;
		if (numeroDeFuncionarios <= 10) {
			impostoArrecadado = super.getRendaAnual() * 0.16;
		}
		else {
			impostoArrecadado = super.getRendaAnual() * 0.14;
		}
		return impostoArrecadado;	
	}
	
	
	
}
