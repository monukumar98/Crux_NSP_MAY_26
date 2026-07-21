package Lec24;

import java.util.*;

public class Group_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
	}

	public static List<List<String>> GroupAnagram(String[] arr) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			String key = GetKey(s);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);

		}
		List<List<String>> ll = new ArrayList<>();
		for (String s : map.keySet()) {
			ll.add(map.get(s));
		}
		return ll;
	}

	private static String GetKey(String s) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			freq[ch - 97]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
		}
		return sb.toString();

	}

}
