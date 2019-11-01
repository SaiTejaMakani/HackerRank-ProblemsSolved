package com.hackerRankPractice.Arrays;

public class hourGlass2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] twoArray = { { 1, 1, 1, 0, 0, 0 }, 
							 { 0, 1, 0, 0, 0, 0 }, 
							 { 1, 1, 1, 0, 0, 0 }, 
							 { 0, 0, 2, 4, 4, 0 },
							 { 0, 0, 0, 2, 0, 0 }, 
							 { 0, 0, 1, 2, 4, 0 } };

		System.out.print(hourglassSum(twoArray));
	}

	static int hourglassSum(int[][] arr) {

		int sum = 0;
		int tempSum = 0;
		int submatrics = 0;
		int r = 0, c = 0;
		boolean firsttime = true;
		while (submatrics != 16) { // iterates for 16 sub-matrices

			tempSum = arr[r][c] + arr[r][c + 1] + arr[r][c + 2] + arr[r + 1][c + 1] + arr[r + 2][c] + arr[r + 2][c + 1]
					+ arr[r + 2][c + 2];

			System.out.println("Submatrix sum: " + tempSum);

			++c;
			if (c == 4) {
				++r;
				c = 0;
			}
			if (firsttime) {
				sum = tempSum;
				firsttime = false;
			} // to work for negative values as 0 is greater than negativ values

			if (tempSum > sum)
				sum = tempSum;

			++submatrics;
			tempSum = 0;

			// System.out.println("Submatrix number: "+ submatrics);
		}
		return sum;
	}
}
