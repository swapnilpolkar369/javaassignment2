package bridgelabz.com.day3;

/*
 * Author: Swapnil
 * Program to find the smallest element in an array
 */
import java.util.Scanner;

public class SmallestElement {
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
			// to find smallest element
			int min = a[0];
			for (int i=0; i<n; i++) {
				if (a[i] < min) {
					min = a[i] ;
				}
			}
			System.out.println(); // for next line
			System.out.println("Smallest element in array is :" + min);
		}
	}
}