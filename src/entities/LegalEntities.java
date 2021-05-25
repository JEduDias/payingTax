package entities;

public class LegalEntities extends Taxpayer {
	

	private Integer numEmployees;
	
	public LegalEntities() {
	}
	
	public LegalEntities(String name, Double income, Integer numEmployees) {
		super(name, income);
		this.numEmployees = numEmployees;
	}
	
	public Integer getNumEmployees() {
		return numEmployees;
	}

	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@Override
	public Double payTax() {
		double tax = 0;
		if (numEmployees <= 10) {
			tax = income + 1.16;
		}
		tax = income + 1.14;
		return tax;
	}

}
