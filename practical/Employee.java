package Shreyosri;

public class Employee {
	private String name;
	private String address;
	private int age;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
class EmployeeTest{
public static void main(String[] args) {
	Employee d =new Employee();
	 d.setName("shreyosri");
     d.setAddress("kolkata");
     d.setAge(24);
     System.out.println("Name is :"+d.getName());
     System.out.println("Adress is:"+d.getAddress());
     System.out.println("Age is:"+d.getAge());
		

	}

	
}
