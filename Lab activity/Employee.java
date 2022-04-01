
public class Employee {
	public long employeeid;
	public  String employeeName;
	public String employeeAddress;
	public  long employeephone;
	public  double basicsalary;
	public  double Hra;
	  public  double specialAllowence;
	  public Employee(long id,String name,String address,long phone){
		   this.employeeid=id;
		   this.employeeName=name;
		   this.employeeAddress=address;
		   this.employeephone=phone;
	   }
	  public void  calculateSalary() {
		  double salary;
		  salary=basicsalary+(basicsalary*specialAllowence/100)+(basicsalary*Hra/100);
	  }
	  
	  
	
}
