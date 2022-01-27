package Shreyosri;

public class Shape {
	void display(){
		System.out.println("inside display");
		}
}
	class Rectangle extends Shape{
		void area(){
			System.out.println("inside area");
		}
		
	}
  class Cube extends Rectangle{
	 void volume(){
		 System.out.println("inside Cube");
		 
	 }
  } 
	
 
 class Test2{
	public static void main(String[] args) {
		
	
		Cube b= new Cube();
		b.volume();
		b.area();
		b.display();
	
	}
 }
		
 


