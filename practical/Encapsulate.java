package Shreyosri;

public class Encapsulate {
private String name;
private int rollno;
private int age;

	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
}
   class TestEncapsulate{
	  
  
	public static void main(String[] args) {
		 Encapsulate d =new Encapsulate();
		 d.setName("shreyosri");
          d.setRollno(3);
          d.setAge(24);
          System.out.println("Name is :"+d.getName());
          System.out.println("RollNo is:"+d.getRollno());
          System.out.println("Age is:"+d.getAge());
	}
  }
   
   
   
   
   
   
   
   
   