package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to print elements of an array 
 */
public class PrintArray {

	public static void main(String[] args) {
		//Array declaration, creation, initialization
		int[] a = {12,45,36,45,96};
		//To print elements of an array
		System.out.println("The elements of an array are : ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}