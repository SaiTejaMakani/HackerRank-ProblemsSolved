package com.hackerRankPractice.warmUp;

public class OccurancesOfA {

	public static void main(String[] args) {
		// finding number of 'a' s in the string that is repeated n times.

		String s = new String("abca");
		long n = 10;
		System.out.println("letter 'a' present in the " + n + " repetitions of string '" + s + "' "
				+ repeatedString(s, n) + " times.");

	}

	static long repeatedString(String s, long n) {
		long count = 0;
		int a_In_s = 0;

		for (char c : s.toCharArray())
			if (c == 'a')
				a_In_s++;

		if (n > s.length()) {
			count += n / s.length() * a_In_s;
		}

		int remainingtringLength = (int) (n % s.length());
		for (int i = 0; i < remainingtringLength; i++)
			if (s.toCharArray()[i] == 'a')
				count++;

		return count;
	}

}
