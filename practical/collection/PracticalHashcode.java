package Shreyosri;
import java.util.*;
class PracticalHashcode {

	
		

			public static void main(String[] args) {
				Eq g1 =new Eq("a",1);
				Eq g2 =new Eq("b",2);
				if(g1.hashCode() == g2.hashCode())
		        {
		  
		            if(g1.equals(g2))
		                System.out.println("Both Objects are equal. ");
		            else
		                System.out.println("Both Objects are not equal. ");
		      
		        }
			   else
		        System.out.println("Both Objects are not equal. ");
			}
}


			
