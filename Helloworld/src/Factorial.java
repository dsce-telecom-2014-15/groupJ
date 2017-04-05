import java.util.Scanner;
public class Factorial {
public static void main (String [] args) {
	int i,a,factorial=1;
	System.out.println("enter the number :");
	Scanner num= new Scanner(System.in);
	 a=num.nextInt();
	for (i=a; i>0; i--)
		factorial=factorial*i;
System.out.println("factorial of the number " + a + " is " +factorial);
	num.close();
}
}
