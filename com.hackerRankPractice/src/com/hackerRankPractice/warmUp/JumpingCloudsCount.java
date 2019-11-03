package com.hackerRankPractice.warmUp;

public class JumpingCloudsCount {

	public static void main(String[] args) {
		// Print the minimum number of jumps needed to win the game. Each time can jump
		// 1 or 2 hopes.
		int[] clouds = { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 }; // should always have valid success path
		System.out.println("Number of jumps to cross the clouds: " + jumpingOnClouds(clouds));
	}

	static int jumpingOnClouds(int[] c) {
		int count = 0;

		for (int i = 0; i < c.length - 1; i++) {
			if (i < c.length - 2)
				if ((c[i] == 0 && c[i + 1] == 0 && c[i + 2] == 0) || // jump 2 clouds to reduce number of hopes
						(c[i] == 0 && c[i + 1] == 1 && c[i + 2] == 0)) // Jump 2 clouds to get away from thunder clouds
					++i;
			count++;
		}
		return count;
	}
}
