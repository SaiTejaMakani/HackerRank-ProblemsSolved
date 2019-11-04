package com.hackerRankPractice.Arrays;

public class arrayManupluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] queries = { { 2, 3, 603 }, { 1, 1, 286 }, { 4, 4, 882 }, };
		int n = 4; // length of my array
		System.out.print(arrayManipulation(n, queries));

	}

	static long arrayManipulation(int n, int[][] queries) {

		long largeValue = 0;
		long[] workArray = new long[n];
		for (int i = 0; i < n; i++)
			workArray[i] = 0;

		for (int[] i : queries) {
			// for (int j = (i[0] - 1); j < i[1]; j++) {
			workArray[i[0] - 1] += i[2];
			if (i[1] <= (n - 1))
				workArray[i[1]] -= i[2];
		}

		for (int i = 1; i < workArray.length; i++) {
			workArray[i] += workArray[i - 1];
			if (workArray[i] > largeValue)
				largeValue = workArray[i];
		}
		return largeValue;
	}
}
