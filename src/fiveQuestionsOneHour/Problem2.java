package fiveQuestionsOneHour;

import java.util.Arrays;

//Write a function that combines two lists by alternatingly taking elements.
//For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3]
public class Problem2 {

	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c' };
		char[] b = { '1', '2', '3' };
		System.out.println("a:\t" + Arrays.toString(a));
		System.out.println("b:\t" + Arrays.toString(b));
		System.out.println("c:\t" + Arrays.toString(combine(a, b)));
	}

	private static char[] combine(char[] a, char[] b) {
		// if the lists are not equal length,
		// then appends longer list after alternating
		char[] c = new char[a.length + b.length];
		int x = 0, y = 0, z = 0;
		int max = Math.max(a.length, b.length);

		for (int i = 0; i < max; i++) {
			if (x < a.length) {
				c[z++] = a[x++];
			}
			if (y < b.length) {
				c[z++] = b[y++];
			}
		}

		return c;
	}
}
