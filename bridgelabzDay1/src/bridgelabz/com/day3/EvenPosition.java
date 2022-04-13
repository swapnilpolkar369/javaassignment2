package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to print the elements of an array present on an even position
 */
import java.util.Scanner;

public class EvenPosition {

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
			//Elements in even position
			System.out.println(); //for next line
			for (int i=0; i<n; i+=2) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
