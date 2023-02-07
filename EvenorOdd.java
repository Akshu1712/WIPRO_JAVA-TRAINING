import java.util.*;
public class EvenOrOdd {

     public static void main(String[] args){
	 Scanner in = new Scanner(System.in);
	 System.out.print("Input a number: ");
     int n = in.nextInt(); 
            if (n % 2 == 0) {
                System.out.println("The number is even"); 
               }
			else {
                System.out.println("The number is odd"); 
              }
     }
}
 27  
SumIsEvenOrOdd.java
@@ -0,0 +1,27 @@
import java.util.Scanner;
public class SumIsEvenOrOdd {
	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.print("Input the First Number:");
		int n1 = s1.nextInt();
		System.out.print("Input the Second Number:");
		int n2 = s1.nextInt();
		int n3 = n1+n2;

		if (n3 % 2 == 0)
		{
			System.out.print("The sum is Even");
		}

		else
		{
			System.out.print("The sum is Odd");
		}


	}



}
