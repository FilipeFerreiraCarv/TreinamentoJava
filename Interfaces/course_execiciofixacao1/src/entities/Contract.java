package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import services.TaxServices;

public class Contract {

	private Integer number;
	private Date date;
	private Double value;
	private Integer installments;	
	
	private TaxServices taxServices;
	
	SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double value, Integer installments) {
		this.number = number;
		this.date = date;
		this.value = value;
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	public TaxServices getTaxServices() {
		return taxServices;
	}

	public void setTaxServices(TaxServices taxServices) {
		this.taxServices = taxServices;
	}

	
}
