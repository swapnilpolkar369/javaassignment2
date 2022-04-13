package bridgelabz.com.day2;
/*
 * Author: Swapnil
 * Program to print true if day d of month is between March20(m=3,d=20)
 * and june(m=6,d=20),false otherwise
 */
import java.util.Scanner;
public class SpringSeason {
	public static void main(String[] args) {
		int m,d;
		System.out.println("Enter date and month");
		try (Scanner sc = new Scanner(System.in)) {
			d = sc.nextInt();
			m = sc.nextInt();
		}
		if ((d>=1) && (d<=31) && (m>3) && (m<6)) {
			System.out.println("True");
		}
		else if ((m==3) && (d>=20) && (d<=31)) {
			System.out.println("True");
		}
		else if ((m==6) && (d>=1) && (d<=20)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
      
      
      
}