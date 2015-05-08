package fiveQuestionsOneHour;

//Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion
public class Problem1 {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };// sums to 45
		System.out.println("Correct sum:\t" + 45);
		System.out.println("For-Loop\t" + forSum(a));
		System.out.println("While-Loop:\t" + whileSum(a));
		System.out.println("Recursive:\t" + recursiveSum(a));
	}

	private static int forSum(int[] a) {
		if (a == null) {
			throw new NullPointerException();
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	private static int whileSum(int[] a) {
		if (a == null) {
			throw new NullPointerException();
		}
		int sum = 0;
		int i = 0;
		while (i < a.length) {
			sum += a[i++];
		}
		return sum;
	}

	private static int recursiveSum(int[] a) {
		return recursiveSum(a, a.length-1);
	}

	private static int recursiveSum(int[] a, int i) {
		if (a == null) {
			throw new NullPointerException();
		}
		if (i == 0) {
			return a[0];
		}
		return a[i] + recursiveSum(a, i - 1);
	}

}
