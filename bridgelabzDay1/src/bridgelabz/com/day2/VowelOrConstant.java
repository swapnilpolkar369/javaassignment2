package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program to check vowel or constant
 */
import java.util.Scanner;

public class VowelOrConstant {
	public static void main(String[] args) {
	    char f;
	    System.out.println("Enter alphabate");
	    try (Scanner sc = new Scanner(System.in)) {
			f = sc.next().charAt(0);
		}
	    switch (f) {
	    case 'a':
	    System.out.println(f+"is a vowel");
	    break;
	    case 'e':
	    System.out.println(f+"is a vowel");
	    break;
	    case 'i':
	    System.out.println(f+"is a vowel");
	    break;
	    case 'o':
	    System.out.println(f+"is a vowel");
	    break;
	    case 'u':
	    System.out.println(f+"is a vowel");
	    break;
	    default :
	    System.out.println(f+"is a constant");	
	    break;
	    }
		}
}