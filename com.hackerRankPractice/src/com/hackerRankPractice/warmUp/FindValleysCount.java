package com.hackerRankPractice.warmUp;

public class FindValleysCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		String path = new String("DUDUD");
		System.out.println("Number of valleys crossed in the path:" + countingValleys(n, path));
	}

	static int countingValleys(int n, String s) {
		int count = 0;
		int level = 0;
		char[] path = s.toCharArray();
		for (char c : path) {
			if (c == 'U')
				++level;
			if (c == 'D')
				--level;

			if ((c == 'U') && (level == 0))
				count++;
		}
		return count;
	}
}
