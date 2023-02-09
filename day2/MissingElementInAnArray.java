package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		//Here is the Input
		int arr [] = {1,2,3,4,7,6,8};
		
		//Sorted the Array
		Arrays.sort(arr);
		
		for (int i = 1; i < arr.length-1; i++) {
			
			if (i!= arr[i-1]) {
				
				System.out.println("Missing Elemnent is "+i);
				break;
			}
		}
		
		
	}

}
