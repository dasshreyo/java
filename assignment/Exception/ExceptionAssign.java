

	import java.util.InputMismatchException;
import java.util.Scanner;

	public class ExceptionAssign {
	
		public static void main(String a[])
		{
		
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter value of x and y");
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			if(y==0)
			{
				throw new ArithmeticException("can not divide by 0");
			}
			
			
			else 
			{
				int r=x/y;
				System.out.println("division is "+r+ ", success");
			}
			
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		
		
		
	}
}
