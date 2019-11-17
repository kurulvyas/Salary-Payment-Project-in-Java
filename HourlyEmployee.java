
/**This is a class for Hourly employee who gets salary on the basis of product of hourlywages and number of hours they work in company.
 * @author kurul
 *
 */
public class HourlyEmployee extends Employee {

	private double hourlyWage;//Hourly wage which is received by each employee per hour
	private int hours;//Number of hours worked by an employee
	
	//Constructor for SalariedEmployee
	public HourlyEmployee(String firstName, String lastName, String irdNo,double hourlyWage,int hours) {
		super(firstName, lastName, irdNo);
		if(hourlyWage<16.5) {//Wage entered should not be less than 16.5 dollars
			System.out.println("The salary cannot be less than basic salary");
		}
		else {
			this.hourlyWage=hourlyWage;
		}

		if(hours<0 || hours>65) {//Numer of hours worked by an employee should be greater than 0 and less than 65 hours
			System.out.println("Please enter appropriate hours");
		}
		else{
			this.hours=hours;
		}
	}
	
	//getter method for hourly wage to give its value when called by main method
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	//setter method for hourly wage to set its value when passed by main method
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	//getter method for number of hours worked by an employee gives its value when called by main method
	public int getHours() {
		return hours;
	}
	
	//setter method for number of hours worked by an employee is set to its value when passed by main method
	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public double earnings() {
		return hours*hourlyWage;//Salary earned is a product of hourlywages and number of hours they work in company.
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public String toString() {
		//This method on execution will display all the required elements of HourlyEmployee Class on Console
		return "hourly employee :"+getFirstName()+" "+getLastName()+"\n"+super.toString()+"hourly wage :$"+getHourlyWage()+",hours worked :"+getHours()+"\nearned :$"+earnings()+"\n";
	}


}
