package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program to reverse integer number using while loop
 */
import java.util.Scanner;

public class ReverseIntWhile {
	public static void main(String[] args) {
		int n,rem,rev=0;
		System.out.println("Enter the number");
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
		}
		while ( n > 0) {
	    rem = n % 10;
	    rev = rev*10 + rem;
	    n = n/10;
        
	}
     System.out.println("The reverse number is" + rev);
}
}