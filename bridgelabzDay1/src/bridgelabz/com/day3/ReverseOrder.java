package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to print the elements of an array in reverse order
 */
import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {
		System.out.println("Enter the length of an array");
		try (//input the length of an array
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			//array declaration and creation
			int[] a = new int[n];
			//input the element of an array
			System.out.println("Enter the elements in array :");
			for (int i = 0; i<n; i++) {
				a[i] = sc.nextInt();
				System.out.print(a[i] + " ");
			}
			//elements of an array in reverse order
			System.out.println(); //for next line
			 for (int i=n-1; i>=0; i--) {
				 System.out.print(a[i] + " ");
			 }
		}
	}

}