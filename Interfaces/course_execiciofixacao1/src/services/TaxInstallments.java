package services;

public class TaxInstallments implements TaxServices {

	@Override
	public double tax(int parcel, double value) {
			double a = value + (value * 0.01 * parcel);
			double b = a + (a * 0.02);
		return  b;
	}


	
}
