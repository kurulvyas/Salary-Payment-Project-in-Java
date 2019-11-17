
/**This is an Employee class which is abstract and will inherit first name ,last name and Ird Number to its subclasses.
 * 
 * @author Kurul
 *
 */
public abstract class Employee{

	private String firstName;//First name of user as String
	private String lastName;//Last name of user as String
	private String irdNo;//IRD number of user as String because between the numbers there are alphanumeric characters
	
	//Constructor of Employee Class
	public Employee(String firstName, String lastName, String irdNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.irdNo = irdNo;
	}
	//getter method for firstname which returns a firstname when called by main method.
	public String getFirstName() {
		return firstName;
	}
	//setter method for firstname which sets a name when passed by method in main method.
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	//getter method for lastname which returns a lastname when called by main method.
	public String getLastName() {
		return lastName;
	}
	//setter method for larstname which which sets a name when passed by method in main method.
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//getter method for irdNo which returns a name when called by main method.
	public String getIrdNo() {
		return irdNo;
	}
	//setter method for irdNo which which sets a irdNo when passed by method in main method.
	public void setIrdNo(String irdNo) {
		this.irdNo = irdNo;
	}
	//toString method helps in generating output as a String when called by main method.
	public String toString() {
		return "IRD No:"+getIrdNo()+"\n";
	}
	//Abstract method earnings used to get the final salary earned by user.
	public abstract double earnings();

}
