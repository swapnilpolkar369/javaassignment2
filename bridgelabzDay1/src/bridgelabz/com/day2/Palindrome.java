package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program to find palindrome number
 */
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int a,rem,rev=0;
		System.out.println("Enter the number");
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
		}
		int n=a;
		for (;a>0;) {
		rem = a % 10;
		rev = rev*10 + rem;
		a = a/10;
		}
        System.out.println(rev);
        if ( n == rev ) {
        System.out.println("The number is palindrome");	
        }
        else {
        System.out.println("The number is not palindrome"); 	
        }
	}
}