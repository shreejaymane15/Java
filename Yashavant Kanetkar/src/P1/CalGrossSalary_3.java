package P1;

public class CalGrossSalary_3 {
	public static void main(String[] args) {
		float b_salary, d_allowance, h_r_allowance, g_salary;
		b_salary = 15000.00f;
		d_allowance = (40 * b_salary)/100;
		h_r_allowance = (20 * b_salary)/100;
		g_salary = b_salary + d_allowance + h_r_allowance;
		System.out.println("Basic Salary = " + b_salary);
		System.out.println("Dearness Allowance = " + d_allowance);
		System.out.println("House Rent Allowance = " + h_r_allowance);		
		System.out.println("Gross Salary = " + g_salary);				
	}

}
