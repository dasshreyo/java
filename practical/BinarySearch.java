package Shreyosri;

import java.util.Scanner;

class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter,num,item,array[],first,last,mid;
 Scanner input=new Scanner(System.in);
 System.out.println("Enter search value");
 num=input.nextInt();
 array=new int[num];
 System.out.println("Enter "+ num + "integers");
 for (counter = 0; counter < num; counter++)
     array[counter] = input.nextInt();

 System.out.println("Enter the search value:");
 item = input.nextInt();
 first = 0;
 last = num - 1;
 mid = (first + last)/2;

 while( first <= last )
 {
    if ( array[mid] < item )
      first = mid + 1;
    else if ( array[mid] == item )
    {
      System.out.println(item + " found at location " + (mid + 1) + ".");
      break;
    }
    else
    {
        last = mid - 1;
    }
    mid = (first + last)/2;
 }
 if ( first > last )
     System.out.println(item + " is not found.\n");

	}

}
