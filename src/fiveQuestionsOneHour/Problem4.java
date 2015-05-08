package fiveQuestionsOneHour;

import java.util.Arrays;
import java.util.Comparator;

//Write a function that given a list of non negative integers,
//arranges them such that they form the largest possible number.
//For example, given [50, 2, 1, 9], the largest formed number is 95021
public class Problem4 {

	private static Integer[] a = { 50, 2, 1, 9 };

	public static void main(String[] args) {
		System.out.println("Numbers:\t" + Arrays.toString(a));
		System.out.println("Largest Number:\t" + largestNumber(a));
	}

	private static String largestNumber(Integer[] a) {
		Arrays.sort(a, new Comparator() {

			@Override
			public int compare(Object lhs, Object rhs) {
				String v1 = lhs.toString();
				String v2 = rhs.toString();

				return (v1 + v2).compareTo(v2 + v1) * -1;
			}
		});
		String result = "";
		for (Integer integer : a) {
			result += integer.toString();
		}

		return result;
	}
}
