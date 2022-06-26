package entities;

public class PessoaFisica extends Contribuinte{

	private Double gastosComSaude;
	
	public PessoaFisica() {
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
		super(name, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double impostoArrecadado() {
		double impostoArrecadado = 0;
		if (super.getRendaAnual() < 20000) {
			impostoArrecadado = super.getRendaAnual() * 0.15 - (gastosComSaude * 0.5);
		}
		else {
			impostoArrecadado = super.getRendaAnual() * 0.25 - (gastosComSaude * 0.5);
		}
		return impostoArrecadado;	
	}

}
