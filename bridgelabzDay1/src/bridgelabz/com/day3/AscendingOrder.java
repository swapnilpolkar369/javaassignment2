package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to sort elements of an array in ascending order
 */
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
		System.out.println("Enter the length of an array");
		try (//input the length of an array
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			//array declaration and creation
			int[] a = new int[n];
			//input the elements of an array
			System.out.print("Enter the elements in array :");
			for (int i = 0; i<n; i++) {		
				a[i] = sc.nextInt();
				System.out.print(a[i] + " ");
			}
			//Ascending order
      for (int i=0; i<a.length; i++) {
			   for (int j=i+1; j<a.length; j++) {
				   if ( a[j] < a[i] ) {
					 int temp = a[i];
					   a[i] = a[j];
					   a[j] = temp;
				   }
			   }
      }
      //Printing array in ascending order
      System.out.println();// for next line
      for (int i=0; i<a.length; i++) {    	  
			   System.out.print(a[i] + " ");
      }
		}
    }
}