package bridgelabz.com.day3;
/*
 * Author: Swapnil
 * Program to find  the frequency of each element in the array 
 */
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// input the length of an array
         System.out.println("Enter the length fo an array");
         try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			 System.out.println(n);
			 //array declaration and creation
			 int[] a = new int[n];
			 int[] b = new int[n];   //array to store frequencies of element
			 //input the elements of an array
			 System.out.println("Enter the elements of an array :");
			 for (int i=0; i<n; i++) {
				 a[i] = sc.nextInt();
				 System.out.print(a[i] + " ");
			 }
			 for (int i=0; i<n; i++) {
				 int count = 1;
				 if (a[i] != -1) { //to avoid counting same element again
					 for (int j=i+1; j<n; j++) {
						 if (a[i] == a[j]) {
							 count = count+1;
							 a[j] = -1;
						 }
					 }
					 b[i] = count;
				 }
			 }
			 //Display the frequency of each element
			 System.out.println();
			 for (int i=0; i<n; i++) {
				 if (a[i] != -1) {
					 System.out.println(a[i] + ":" + b[i]);
				 }
			 }
		}
       }
}