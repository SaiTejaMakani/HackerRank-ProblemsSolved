package com.hackerRankPractice.hashTables;

import java.util.ArrayList;
import java.util.List;

public class TwoStringsMatchedSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(twoStrings("hi", "world"));

	}

	static String twoStrings(String s1, String s2) {

		List<Character> s1_chars = new ArrayList<Character>();

		for (char s : s1.toCharArray())
			s1_chars.add(s);

		for (char r : s2.toCharArray())
			if (s1_chars.contains(r))
				return "YES";

		return "NO";
	}

}
