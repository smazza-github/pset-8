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

	if (numbers == null) {

		return false;

	} else if (numbers.length < 1) {

		return false;

	}

	for (int i = 1; i < numbers.length - 1; i++) {

		if (numbers[i] < numbers[i+1] && numbers[i-1] < numbers[i]) {

			return true;

		}
	}

		return false;	// default return value to ensure compilation

	}

// Exercise 7 //

	public boolean everywhere(int[] numbers, int x) {

		if (numbers.length < 1 || numbers == null) {

			return false;

		}

    int gap = 0;
		boolean lastPosition = false

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] == x) {

				gap = 0;
				lastPosition = true;

			} else {

				if (i == 1 && lastPosition == false) {

					return false;

				} else if (lastPosition == false) {

					gap++;

				}

				lastPosition = false;

			}

			if (gap == 2) {

				return false;
			}
		}

		return true;

	}

// Exercise 8 //

	public boolean consecutive(int[] numbers) {

		if (numbers.length < 3 || numbers == null) {

			return false;

		}

  	int digitsInRow = 0
		int remainder1 = -1
		int remainder2 = -1

		for (int i = 0; i < numbers.length; i++) {

			remainder1 = numbers[i] % 2

			if (remainder1 == 1) {

				if (remainder2 == 1) {

					digitsInRow++;

			 	} else {

					digitsInRow = 1;

				}

			} else {

				if (remainder2 == 0) {

					digitsInRow ++;

				} else {

					digitsInRow = 1;

				}
			}

			if (digitsInRow == 3) {

				return = 1;

			}

			remainder2 = remainder1;

		}

		return false;	// default return value to ensure compilation

	}

// Exercise 9 //

	public boolean balance(int[] numbers) {

 	int halfSum1 = 0;
	int halfSum2 = 0;

	for (int x = i; x >= 0; x--){

		halfSum1 += numbers[x];

	}

	for (int z = i + 1; z < numbers.length; z++) {

		halfSum2 += numbers[z];

	}

	if (halfSum1 == halfSum2) {

		return true;

	}
}

		return false;	// default return value to ensure compilation

	}

// Exercise 10 //

	public int clumps(String[] values) {

	if (values == null) {

		return -1;

	}

		for (int i = 0; i < values.length; i++) {

			if (values[i] == null) {

				return -1;

			}
		}

    boolean equal = false;
		boolean prevEqual = false;

		String before = "";
		int clumps = 0;

		for (int i = 0; i < values.length; i++) {

			if (before.equals(values[i])) {

				equal = true;

				if (prevEqual != true) {

					clumps++;

				 }
				} else {

					equal = false;

				}

				before = values[i];
				prevEqual = equal;

			}

			return clumps;

		}
}
