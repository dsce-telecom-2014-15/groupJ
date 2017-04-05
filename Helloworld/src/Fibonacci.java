import java.util.Scanner;


public class Fibonacci {
	public static void main(String[] args){
	int i; 
	 
 System.out.println("enter the number :");
 Scanner num = new Scanner(System.in);
 int a=num.nextInt();
int[] fibo=new int[a];
 fibo[0]=0; 
 fibo[1]=1;
 for(i=2; i<a; i++)
 { 
	 fibo[i] = fibo[i-1] + fibo[i-2];
 }
	 for(i=0; i<a; i++)
	 System.out.println(fibo[i]);
 num.close();
}
}