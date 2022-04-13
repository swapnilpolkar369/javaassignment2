package bridgelabz.com.day3;
/* 
 * Author: Swapnil
 * Program to find the largest element of an array
 */
import java.util.Scanner;
public class LargestElement {
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
			//maximun element in array
			int max = a[0];
			for (int i=0; i<n; i++) {
				if (a[i] > max) {
					max = a[i] ;
				}
			}
			System.out.println("Largest element in array is :" + max);
		}
	}

}