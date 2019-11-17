
/**This is a class for Salaried employee who gets fix salary irrespective of the numbers they work in company.
 * @author kurul
 *
 */
public class SalariedEmployee extends Employee {

	private double weeklySalary;//Fixed Salary which the employee gets at the end of each week

	//Constructor for SalariedEmployee
	public SalariedEmployee(String firstName, String lastName, String irdNo,double weeklySalary) {
		super(firstName, lastName, irdNo);//This will call constructor of superclass
		if(weeklySalary<0.0){
			System.out.println("Salary cannot be less than 0");
		}else
			this.weeklySalary=weeklySalary;

	}
	//Setter method for weekly Salary to set its value when passed by main method
	public  void setWeeklySalary(double weeklySalary) {
		this.weeklySalary=weeklySalary;
	}
	//Getter method for weekly Salary to get value when called by main method
	public double getWeeklySalary() {
		return weeklySalary;//will return weeklySalary
	}
	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public double earnings() {
		return weeklySalary;//As employee will get fixed salary so there is earned will be same as fixedsalary
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public String toString() {
		//This method on execution will display all the required elements of SalariedEmployee Class on Console
		return "Slaried Employee :"+getFirstName()+" "+getLastName()+"\n"+super.toString()+"weekly salary: $"+getWeeklySalary()+"\nearned: $"+earnings()+"\n";
	}
}
