
/**This is the demo class to operate all the classes and subclasses of abstract class employee
 * @author kurul
 *
 */
public class DemoEmployee {

	public static void main(String[] args) {

		System.out.println("Employee processed individually\n");

		SalariedEmployee se1 = new SalariedEmployee("John","Smith","102-034-506",800);//se1 is object created of type SalariedEmployee
		System.out.println(se1.toString());//Calling tostring method of SalariedEmployee

		HourlyEmployee he1 = new HourlyEmployee("Karen","Price","113-145-106",16.75,40);//he1 is object created of type HourlyEmployee
		System.out.println(he1.toString());//Calling tostring method of HourlyEmployee

		CommisionEmployee ce1 =new CommisionEmployee("Sue","Jones","130-040-606",10000,0.06);//ce1 is object created of type CommisionEmployee
		System.out.println(ce1.toString());//Calling tostring method of CommisionEmployee

		BasePlusCommisionEmployee bp1 =new BasePlusCommisionEmployee("Bob","Lewis","104-020-305",5000,0.04,300);//bp1 is object created of type BasePlusCommisionEmployee
		System.out.println(bp1.toString());//Calling tostring method of BasePlusCommisionEmployee

		System.out.println("Employees processed Polymorphically\n");

		Employee emp[]=new Employee[4];//Array of Employee Class

		emp[0]= new SalariedEmployee("John","Smith","102-034-506",800);//emp[0] is object created of type SalariedEmployee by refrence of Employee class
		emp[1]= new HourlyEmployee("Karen","Price","113-145-106",16.75,40);//emp[1] is object created of type HourlyEmployee by refrence of Employee class
		emp[2]= new CommisionEmployee("Sue","Jones","130-040-606",10000,0.06);//emp[2] is object created of type CommisionEmployee by refrence of Employee class
		emp[3]= new BasePlusCommisionEmployee("Bob","Lewis","104-020-305",5000,0.04,300);//emp[3] is object created of type BasePlusCommisionEmployee by refrence of Employee class

		for(int i=0;i<4;i++) {
			
			if(emp[i] instanceof SalariedEmployee ) {//manipulating object of SalariedEmployee
				((SalariedEmployee) emp[i]).setWeeklySalary(2000);
			}
			if(emp[i] instanceof HourlyEmployee ) {//manipulating object of HourlyEmployee
				((HourlyEmployee) emp[i]).setHourlyWage(50);
			}
			
			if(emp[i] instanceof BasePlusCommisionEmployee ) {//manipulating object of BasePlusCommisionEmployee
				((BasePlusCommisionEmployee) emp[i]).setBaseSalary(500);
			}
			System.out.println(emp[i].toString());//Calling toString method of each object
		}
		
		String st[]=new String[4];//Creating array for 4 strings
		st[0]="SalariedEmloyee";
		st[1]="HourlyEmloyee";
		st[2]="CommisionEmloyee";
		st[3]="BasePlusCommisionEmloyee";
		
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Employee " +i+ " is a Employee."+st[i]);
		}
	}
}
