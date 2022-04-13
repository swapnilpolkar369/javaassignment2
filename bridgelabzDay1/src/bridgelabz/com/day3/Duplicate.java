package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to print duplicate elements of an array
 */
import java.util.Scanner;

public class Duplicate {
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
			}
			//Duplicate elements
			for (int i=0; i<a.length; i++) {
				for (int j=i+1; j<a.length; j++) {
					if (a[i] == a[j]) {
						System.out.println("The duplicate elements are :" + a[j]);
					}
				}
			}
		}
     }
   }