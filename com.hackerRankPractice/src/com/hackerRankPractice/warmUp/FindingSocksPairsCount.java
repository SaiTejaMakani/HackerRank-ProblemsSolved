package com.hackerRankPractice.warmUp;

import java.util.HashMap;
import java.util.Map;

public class FindingSocksPairsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		int[] socks = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println("Count of sock pairs available:" + findPairs(n, socks));

	}

	static int findPairs(int n, int[] socks) {

		int pairsCount = 0;

		Map<Integer, Integer> socksPairsMap = new HashMap<Integer, Integer>();

		for (Integer j : socks) {
			if (socksPairsMap.get(j) == null) {
				socksPairsMap.put(j, 1);
			} else {
				socksPairsMap.put(j, socksPairsMap.get(j) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : socksPairsMap.entrySet()) {
			pairsCount += (entry.getValue() / 2);
			System.out.println(" key: " + entry.getKey() + " value: " + entry.getValue()); // not needed
		}

		return pairsCount;
	}
}
