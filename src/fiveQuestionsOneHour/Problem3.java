package fiveQuestionsOneHour;

import java.util.Arrays;

//Write a function that computes the list of the first 100 Fibonacci numbers.
//By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
//and each subsequent number is the sum of the previous two.
//As an example, here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
public class Problem3 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(fib(10)));
	}

	private static long[] fib(int l) {
		if (l < 0) {
			throw new IndexOutOfBoundsException("Cannot have array < 0");
		}
		
		long[] f = new long[l];
		
		if (l >= 1) {
			f[0] = 0;
		}
		
		if (l >= 2) {
			f[1] = 1;
		}
		
		for (int i = 2; i < l; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		
		return f;
	}

}
