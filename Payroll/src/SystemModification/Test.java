package SystemModification;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable[] payableObjects = new Employee[4];
		BasePlusCommissionEmployee baseplusCommission = new BasePlusCommissionEmployee(
				"Lisa", "Barnes", "888-88-8888", 500, .06, 1200.00);
		payableObjects[0] = new SalariedEmployee(
				"John", "Smith", "111-11-1111", 800.00);
		payableObjects[1] = baseplusCommission;
		
		payableObjects[2] = new CommissionEmployee("kostas", "ataktdisi", "999-99-9999", 800, .06);
		payableObjects[3] = new HourlyEmployee("antonis", "xazos", "777-77-7777", 800, 42);
		
		System.out.println(
				"Invoices and Employees processed polymorphically:");
		
		for(Payable currentPayable : payableObjects)
		{
		
			if(currentPayable instanceof BasePlusCommissionEmployee)
			{
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
				employee.setBaseSalary(1.10 * employee.getBaseSalary());
				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", 
						employee.getBaseSalary());
			}
			System.out.println("payment due " + currentPayable.toString()
			+ " " + currentPayable.getPaymentAmount());
			//currentPayable.toString(),
		}
	}

}
