package bridgelabzDay1;
/*
 * Author: Swapnil
 * program to demostrate static variable
 */
public class demoStatic {
   static {
	   System.out.println("we are in staticblock");
   }
   static void method() {
	   System.out.println("we are in method");
   }
   static int a = 1;
   public static void main(String[] args) {
	System.out.println("static variable" + a);
}
}