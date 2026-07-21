package Lec24;

import java.util.*;

public class HashMap_Demo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		// add
		map.put("Raj", 94);
		map.put("Shiva", 78);
		map.put("Ankita", 74);
		map.put("Puneet", 66);
		map.put("Manoj", 77);
		map.put("Kunal", 74);
		map.put("Ankita", 67);
//		map.put(null, 67);
	//	System.out.println(map);
//		Set<String>  set = map.keySet();
//		System.out.println(set);
//		for(String k:set) {
//			System.out.println(k+" "+map.get(k));
//		}
		for(String k:map.keySet()) {
			System.out.println(k+" "+map.get(k));
		}
	}
}
