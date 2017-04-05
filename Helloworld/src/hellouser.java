import java.util.Scanner;
public class hellouser {
	public static void main(String [] args) {
		System.out.println("enter the name");
		Scanner name1 = new Scanner(System.in);
		String name = name1.nextLine();
		System.out.println("Hello " + name + "!");
		name1.close();
	}
}
