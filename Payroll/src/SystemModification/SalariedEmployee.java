package SystemModification;

public class SalariedEmployee extends Employee {

	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
			double weeklySalary) {
		
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
		
		this.weeklySalary = weeklySalary;
	}
	
	

	public double getWeeklySalary() {
		return weeklySalary;
	}



	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}



	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return getWeeklySalary();
	}
	
	@Override
	public String toString()
	{
		return String.format("Salaried employee: %s%n%s: $%,.2f", 
				super.toString(), "weekly salary", getWeeklySalary());
	}

}
