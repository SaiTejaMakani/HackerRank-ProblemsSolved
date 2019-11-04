package com.hackerRankPractice.hashTables;

import java.util.ArrayList;
import java.util.List;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] magazine = new String[] { "give", "me", "one", "grand", "today", "night" };
		String[] note = new String[] { "give", "me", "grand", "me", "today" };
		checkMagazine(magazine, note);
	}

	static void checkMagazine(String[] magazine, String[] note) {

		List<String> MagazineList = new ArrayList<String>();

		for (String s : magazine)
			MagazineList.add(s);

		for (String r : note) {
			if (!MagazineList.contains(r)) {
				System.out.print("No");
				return;
			} else
				MagazineList.remove(r);
		}
		System.out.print("Yes");
		return;
	}

}
