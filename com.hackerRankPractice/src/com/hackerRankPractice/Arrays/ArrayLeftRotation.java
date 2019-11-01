package com.hackerRankPractice.Arrays;

public class ArrayLeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

		int[] arr = { 1, 2, 3, 4, };
		for (int i : rotLeft(arr, 4))
			System.out.print(i + " ");
	}

	static int[] rotLeft(int[] a, int d) {

		int Arr_length = a.length;
		int[] return_arr = new int[a.length];

		int temp = 0;

		if (d > Arr_length) 
			temp = d % Arr_length;
		 else
			temp = d;

		int z = 0;
		for (int x = temp; x < Arr_length; x++, z++)
			return_arr[z] = a[x];
		for (int y = 0; y < temp; y++, z++)
			return_arr[z] = a[y];

		return return_arr;
	}

}
