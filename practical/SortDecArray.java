package Shreyosri;
import java.util.Arrays;
import java.util.Collections;

public class SortDecArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};   
		// sorts array[] in descending order   
		Arrays.sort(array, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(array));

	}

}
