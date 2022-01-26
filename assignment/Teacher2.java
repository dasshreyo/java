package Shreyosri;

public class Teacher2 {
	
		 void teach() {
		  System.out.println("Teaching subject");
		 }
		}
		class Student extends Teacher2 {
		 void listen() {
		  System.out.println("Listening");
		 }
		}
		class Principal extends Teacher2 {
		 void evaluate() {
		  System.out.println("Evaluating");
		 }
		}
		class CheckForHierarchical {
		 public static void main(String argu[]) {
		  Principal p = new Principal();
		  p.evaluate();
		  p.teach();
		  // p.listen(); will produce an error
		 }
		}



