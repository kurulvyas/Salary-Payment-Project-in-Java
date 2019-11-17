
/**This is a class for BasePlusCommision employee who gets salary on the basis of product of gross Sales and Commission rate 
 * and addition of base salary to it as they work in company.

 * @author kurul
 *
 */
public class BasePlusCommisionEmployee extends CommisionEmployee {

	protected double baseSalary;//Addition Salary as basic to the pay
	
	//Constructor for BasePlusCommisionEmployee
	public BasePlusCommisionEmployee(String firstName, String lastName, String irdNo, double grossSales,double commisionRate,double baseSalary) {
		super(firstName, lastName, irdNo, grossSales, commisionRate);
		this.baseSalary=baseSalary;
	}
	//getter method for base salary to give its value when called by main method
	public double getBaseSalary() {
		return baseSalary;
	}
	//setter method for base salary to set its value when passed by main method
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override//overriden setter method for gross sales to set its value when passed by main method
	public  void setGrossSales(double grossSales) {
		this.grossSales=grossSales;
	}

	@Override//overriden getter method for gross sales to give its value when called by main method
	public double getGrossSales() {
		return grossSales;
	}

	@Override//overriden setter method for commision rate to set its value when passed by main method
	public  void setCommisionRate(double commisionRate) {
		this.commisionRate=commisionRate;
	}

	@Override//overriden getter method for commision rate to give its value when called by main method
	public double getCommisionRate() {
		return commisionRate;
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public double earnings() {
		return baseSalary+(grossSales*commisionRate);//Salary earned will be a product of gross Sales and Commision rate and addition of base salary to it;
		
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public String toString() {
		//This method on execution will display all the required elements of BasePlusCommisionEmployee Class on Console
		return "base-salaried-commision employee :"+getFirstName()+" "+getLastName()+"\nIRD No :"+getIrdNo()+"\ngross sales: $"+getGrossSales()+",commision rate :"+getCommisionRate()+",base salary :$"+getBaseSalary()+"\nearned: $"+earnings()+"\n";
	}
}
