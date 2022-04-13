package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program to perform arithmatic operation and find Max. and Min.
 */
import java.util.Scanner;

public class Arithmaticoperation {
	public static void main(String[] args) {
		int a,b,c,x,y,z,w;
		System.out.println("Enter the values");
		try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}
		x = a+b*c;
		y = c+a/b;
		z = a%b+c;
		w = a*b+c;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		
		if ((x>y) && (x>z) && (x>w)) {
		System.out.println("x is greater");	
		}
		else if ((y>z) && (y>w)) {
			System.out.println("y is greater");	
			}
		else if ((z>w)) {
			System.out.println("z is greater");	
			}
		else {
			System.out.println("w is greater");
		}
	} 
}