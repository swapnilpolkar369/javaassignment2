package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program for sum of n natural numbers using for loop
 */
import java.util.Scanner;

public class SumOfNaturalFor {
	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("Enter the number");
        try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
		}
        for (i=1; i<=n; i++) {
        	sum = sum + i;
        }
        System.out.println(sum);
	}
}