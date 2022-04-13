package bridgelabzDay1;
/*
 * Author: Swapnil
 * Program to print the given year is leap year or not
 */
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int y;
		 System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
     if ((y % 4 == 0) && (y % 100 != 0)){
    	 System.out.println(y + "is leap year");
      }
     else if ((y % 100 == 0) && (y % 400 == 0)) {
    	 System.out.println(y + "is leap year"); 
     }
     else {
    	 System.out.println(y + "is leap not year");
     }
		
	}
}