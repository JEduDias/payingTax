package entities;

public class NaturalPerson extends Taxpayer {

	private Double healthSpending;
	
	public NaturalPerson() {
	}
	
	public NaturalPerson(String name, Double income, Double healthSpending) {
		super(name, income);
		this.healthSpending = healthSpending;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	@Override
	public Double payTax() {
		double tax = 0; 
		if (income < 20000) {
			tax = (income * 1.15) - (healthSpending * 1.50);
		}
		tax = (income * 0.25) - (healthSpending * 0.50);
		return tax;
	}
	
	@Override
	public String toString() {
		return name + " $ " + String.format("%.2f", payTax());
	}

}
