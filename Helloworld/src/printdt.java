
public class printdt {
	public static void main(String[] args) {

		int a; // declaration of variable
		a = 10; // initialization of variable

		int b = 20; // in line var declaration and initialization

		float f = 1.1f;
		double d = 2.2;
		String s1 = "firstString"; // using literal
		String s2 = new String("secondString"); // using constructor

		// Printing to console
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("f: " + f);
		System.out.println("d: " + d);
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		// Array declaration;
		int[] intArray1; // one-dimensional array declaration
		intArray1 = new int[10]; // initialization of 1D array.

		int[] intArray2 = new int[5];// declare and init of 1D array in line.

		// Populating data into array
		for (int i = 0; i < intArray1.length; i++) {
			intArray1[i] = i;
		}
		for (int i = 0; i < intArray2.length; i++) {
			intArray2[i] = i;
		}

		// printing array elements to console
		System.out.println("Printing intArray1 elements:");
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}
		System.out.println("Printing intArray2 elements:");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}

		// functions in java

		int x = 1, y = 2, z = 3;
		int minNumber = findminNumber(x, y, z);
		System.out.println("smallest number in (" + x + ", " + y + ", " + z + ") is " + minNumber);

	}

	/**
	 * Method to find largest number among the passed 3 numbers
	 * 
	 * @param x
	 *            first number
	 * @param y
	 *            second number
	 * @param z
	 *            third number
	 * @return Largest number of the 3 numbers
	 */
	private static int findminNumber(int x, int y, int z) {
		if (x < y && x<z)
		{
			return x;
		}
		else {
			if(y<z) {
				return y;
			}	else 
					return z;
			
			}
	}
	}



