public class Exercises {

// Exercise 1 //

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {

			return false;

		} else if ((a[a.length-1] == b[b.length-1]) || (a[0] == b[0])) {

			return true;

		} else {

		return false;	// default return value to ensure compilation

	}
}

// Exercise 2 //

	public String[] endsMeet(String[] values, int n) {

		String emptyString[] = new Strin[0];

		if (values.length < n || values == null || n < 0) {

			return emptyString;

		}

		String[] combinedString = new String[n * 2];
		int nValue = n;

/////////////////////////////////////////////////////////

		for (int i = 0; i < n; i++) {
			combinedString[i] = values[i];
		}

		for (int i = n; i < n * 2; i++) {
			combinedString[i] = values[values.length - nValue];

			nValue--;
		}

		return combinedString;

	}

// Exercise 3 //

	public int difference(int[] numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

// Exercise 4 //

	public double biggest(double[] numbers) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

// Exercise 5 //

	public String[] middle(String[] values) {
		// write your code here

		return null;	// default return value to ensure compilation
	}

// Exercise 6 //

	public boolean increasing(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

// Exercise 7 //

	public boolean everywhere(int[] numbers, int x) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

// Exercise 8 //

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

// Exercise 9 //

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

// Exercise 10 //

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}

}
