import java.util.Scanner;

public class Assignment2 {
   public static void main(String [] args) {
	   Scanner sc=new Scanner(System.in);
	   Double num1;
	   Double num2;
	   System.out.println("Enter num 1 : ");
	   if(!sc.hasNextDouble()) {
		   System.err.println("Enter Double value");
		   return;
	   }
	  if(sc.hasNextInt()) {
	     System.err.println("Enter vaild Double value : ");
	     return;
	   }
	    num1=sc.nextDouble();
	   System.out.println("Enter num2 : ");
	   if(!sc.hasNextDouble()) {
		   System.err.println("Enter Double value");
		   return;
	   }
	   if(sc.hasNextInt()) {
		   System.err.println("Enter vaild Double value : ");
		   return;
		   }
	   num2=sc.nextDouble();
	   double avg=(num1+num2)/2;
	   System.out.println("Avrage = "+avg);
	   sc.close();
	   
	   }
}
