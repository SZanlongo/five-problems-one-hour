package fiveQuestionsOneHour;

import java.util.ArrayList;

//Write a program that outputs all possibilities to put + or - or nothing
//between the numbers 1, 2, ..., 9 (in this order) such that the result is always 100.
//For example: 1 + 2 + 34 – 5 + 67 – 8 + 9 = 100.
public class Problem5 {

	private static int goal = 100;
	private static int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {
		int i = 1;
		for (String string : findPositions(goal, nums[0], 1)) {
			System.out.println((i++) + ("\t" + string));
		}
	}

	static ArrayList<String> findPositions(int sum, int number, int index) {
		int digit = Math.abs(number % 10);
		if (index >= nums.length) {
			if (sum == number) {
				ArrayList<String> result = new ArrayList<>();
				result.add(Integer.toString(digit));
				return result;
			} else {
				return new ArrayList<String>();
			}
		}

		// insert sum
		ArrayList<String> bSum = findPositions(sum - number, nums[index], index + 1);
		// insert sub
		ArrayList<String> bSub = findPositions(sum - number, -nums[index], index + 1);

		int concatNum = 0;
		if (number >= 0) {
			concatNum = 10 * number + nums[index];
		} else {
			concatNum = 10 * number - nums[index];
		}

		// concat, do next
		ArrayList<String> nSkip = findPositions(sum, concatNum, index + 1);

		ArrayList<String> results = new ArrayList<>();

		results.addAll(add(digit, "+", bSum));
		results.addAll(add(digit, "-", bSub));
		results.addAll(add(digit, "", nSkip));

		return results;
	}

	static ArrayList<String> add(int digit, String sign, ArrayList<String> branches) {
		for (int i = 0; i < branches.size(); i++) {
			branches.set(i, digit + sign + branches.get(i));
		}
		
		return branches;
	}
}
