package SystemModification;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable[] payableObjects = new Payable[6];
		
		// populate array with objects that implement Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee(
				"John", "Smith", "111-11-1111", 800.00);
		payableObjects[3] = new BasePlusCommissionEmployee(
				"Lisa", "Barnes", "888-88-8888", 500, .06, 1200.00);
		
		payableObjects[4] = new CommissionEmployee("kostas", "ataktdisi", "999-99-9999", 800, .06);
		payableObjects[5] = new HourlyEmployee("antonis", "xazos", "777-77-7777", 800, 42);
		
		
		System.out.println(
				"Invoices and Employees processed polymorphically:");
		
		for(Payable currentPayable : payableObjects)
		{
			
			System.out.printf("%n%s %n%s: $%,.2f%n", 
					currentPayable.toString(), 
					"payment due", currentPayable.getPaymentAmount());
		}
	}

}