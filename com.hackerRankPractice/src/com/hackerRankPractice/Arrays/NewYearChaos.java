package com.hackerRankPractice.Arrays;

public class NewYearChaos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 };
		minimumBribes(q);
	}

	static void minimumBribes(int[] q) {
		int total_q_swaps = 0;

		for (int i = 0; i < q.length - 1; i++) {
			if ((q[i] - (i + 1)) > 2) {
				System.out.println("Too chaotic");
				return;
			}
		}

		for (int i = 0; i < q.length; i++) {
			for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++) {
				if (q[j] > q[i]) {
					total_q_swaps++;
				}
			}
		}
		System.out.println(total_q_swaps);
		return;
	}

}