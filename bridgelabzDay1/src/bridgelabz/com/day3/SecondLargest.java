package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to find second largest number in an array
 */
import java.util.Scanner;

public class SecondLargest {
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
			int largest = Integer.MIN_VALUE;
			int second_largest = Integer.MIN_VALUE;
			//to find second largest element
			for (int i=0; i<a.length; i++) {
				if (a[i] > largest) {
					second_largest = largest;
					largest = a[i];
				}
				else if (a[i] > second_largest && a[i] != largest) {
					second_largest = a[i];
				}
			}
			   System.out.println(); //for next line
				if (second_largest == Integer.MIN_VALUE) {
					System.out.println("There is no second largest number in an array");
				}
				else {
					System.out.println("The second largest number is :" + second_largest);
				}
		}
   }
} 