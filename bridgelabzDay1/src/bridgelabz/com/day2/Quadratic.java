package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program to find out the roots of the quadratic equation
 */
import java.util.Scanner;
 class Quadratic {
	public static void main(String[] args) {
		double a,b,c,determinant,root1,root2;
		System.out.println("Enter the values");
	     try (Scanner sc = new Scanner(System.in)) {
			a = sc.nextDouble();
			 b = sc.nextDouble();
			 c = sc.nextDouble();
		}
	     determinant = (b*b) - (4*a*c);
	     if (determinant > 0) {
	    	root1 = (-b + Math.sqrt(determinant))/2*a;
	    	root2 = (-b - Math.sqrt(determinant))/2*a;
	    	System.out.println("The roots of equation are" + " " + root1 + " " + "and" + root2 );
	     }
	     else if (determinant == 0) {
	    	 root1 = -b/(2*a);
	    	 root2 = -b/(2*a);
	    	 System.out.println("The roots of equation are" + " " + root1 + " " + "and" + root2 );
	     }
	     else {
	    	  double x = -b/(2*a);
	    	  double y = Math.sqrt(-determinant)/2*a;
	    	 System.out.println("Roots are" + x + "+" + y + "i" + "and" + x + "-" + y + "i");
	     }
	}
     
}