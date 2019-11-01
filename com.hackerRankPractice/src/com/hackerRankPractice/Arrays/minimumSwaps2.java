package com.hackerRankPractice.Arrays;

public class minimumSwaps2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 3, 1, 2 };
		System.out.println("MinimumSwaps required are:" + minimumSwaps(arr));

	}

	static int minimumSwaps(int[] arr) {
		int first = 0, last = arr.length - 1;
		int swaps = 0;
		while (first < last) {
			while (arr[first] == first + 1 && first < last)
				first++;
			if (first < last) {
				System.out.println(first + ", " + (arr[first] - 1));
				int temp = arr[arr[first] - 1];
				arr[arr[first] - 1] = arr[first];
				arr[first] = temp;
				swaps++;
			}
		}
		return swaps;
	}

}
