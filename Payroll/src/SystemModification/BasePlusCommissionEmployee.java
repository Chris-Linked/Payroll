package SystemModification;

public class BasePlusCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, 
			String socialSecurityNumber, double grossSales,
			double commissionRate, double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		// TODO Auto-generated constructor stub
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double getPaymentAmount()
	{
		return getBaseSalary() + super.getPaymentAmount();
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f", 
				"base salaried", super.toString(),
				"base salary", getBaseSalary());
	}

}
