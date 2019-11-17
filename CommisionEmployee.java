
/**This is a class for Commision employee who gets salary on the basis of product of gross Sales and Commission rate they work in company.
 * @author kurul
 *
 */
public class CommisionEmployee extends Employee{

	protected double grossSales;//Total gross Sales
	protected double commisionRate;//Commision rate offered by company
	
	//Constructor for CommisionEmployee
	public CommisionEmployee(String firstName, String lastName, String irdNo,double grossSales,double commisionRate) {
		super(firstName, lastName, irdNo);
		try{//Will try to catch if commision rate is less than 100
			if (commisionRate >100){
               }
			this.grossSales=grossSales;
        } catch(Exception e){ 
        	System.out.println("Commisioncannot be greater than 100 percent");
        }
		this.commisionRate=commisionRate;
	}
	
	//getter method for gross sales to give its value when called by main method
	public double getGrossSales() {
		return grossSales;
	}
	
	//setter method for gross sales to set its value when passed by main method
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	
	//getter method for commision rate to give its value when called by main method
	public double getCommisionRate() {
		return commisionRate;
	}
	
	//setter method for commision rate to set its value when passed by main method
	public void setCommisionRate(double commisionRate) {
		try{
			if (commisionRate >100) {};
			this.commisionRate = commisionRate;
			
        } catch(Exception e){ 
        	System.out.println("Commision cannot be greater than 100 percent");
        }
		
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public double earnings() {
		return grossSales*commisionRate;//Salary earned will be a product of gross Sales and Commision rate.
		 
	}

	@Override//This method with same name is present in superclass but keyword override explicitly tells to execute this method.
	public String toString() {
		//This method on execution will display all the required elements of CommissionEmployee Class on Console
		return "commision employee :"+getFirstName()+" "+getLastName()+"\n"+super.toString()+"gross sales :$"+getGrossSales()+",commision rate :"+getCommisionRate()+"\nearned :$"+earnings()+"\n";
	}
}
