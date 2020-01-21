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

		if (numbers.length < 1 || numbers == null) {

		return -1;		// default return value to ensure compilation

	}

		int smallestValue = numbers[0];
		int largestValue = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largestValue) {

				largestValue = numbers[i];

			}

			if (numbers[i] < smallestValue) {

				smallestValue = numbers[i];

			}
		}

 return largestValue - smallestValue;

}

// Exercise 4 //

	public double biggest(double[] numbers) {

	if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0) {

		return -1;		// default return value to ensure compilation

	}

	for (int i = 0; i < numbers.length; i++){

		if (number[i] < 0) {

			return -1;

		}
	}

	double firstDigit = numbers[0];
	double middleDigit = numbers[(int) Math.floor(numbers.length / 2)];
	double lastDigit = numbers[numbers.length - 1];

	double max = (firstDigit > lastDigit && firstDigit > middleDigit) ? firstDigit : lastDigit;

	return max;

}

// Exercise 5 //

	public String[] middle(String[] values) {

	String[] empty = new String[0];

	if (words == null) {

		return empty;

	}	else if (words.length % 2 == 0 || words.length < 3) {

		return empty;

	}

	for (int i = 0; i < words.length; i++) {

		boolean isNull = false;
		isNull = (words[i] == null) ? true : false

		if (isNull) {
			return empty;
		}
	}

	String[] outputArray = new String[3];

	outputArray[0] = words[(int) Math.floor(words.length / 2) - 1];
	outputArray[1] = words[(int) Math.floor(words.length / 2)];
	outputArray[2] = words[(int) Math.floor(words.length / 2) + 1];

	return outputArray;

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
