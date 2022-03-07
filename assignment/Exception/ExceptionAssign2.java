import java.util.Scanner;

public class ExceptionAssign2 {


static long r;
	
	public long  power(int x,int y)
	{
		if(x==0&&y==0)
		
		{
			throw new ArithmeticException("n1 and n2 should not be zero ");
			
		}else if(x<0||y<0)	
			{
			throw new ArithmeticException(" n1 and n2 should not be negative ");
			}
		
		
			
	
	else
	{
		 r=(long) Math.pow(x, y);
	}
		
	return r;
	}
	public static void main(String[] args) {

		 ExceptionAssign2  obj=new  ExceptionAssign2();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of x and y");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		obj.power(m,n);
		System.out.println("power of "+m+","+n+" is "+r);
		
	}
}

