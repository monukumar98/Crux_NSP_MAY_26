package Lec24;

import java.util.*;

public class HashMap_Demo {

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
		System.out.println(map);
//		// get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("Ankita"));
//		// conatinskey
//		System.out.println(map.containsKey("Ankit"));
//		System.out.println(map.containsKey("Ankita"));
//		// remove
//		System.out.println(map.remove("Ankit"));
//		System.out.println(map.remove("Ankita"));
//		System.out.println(map);
		TreeMap<String, Integer> map1 = new TreeMap<>();
		// add
		map1.put("Raj", 94);
		map1.put("Shiva", 78);
		map1.put("Ankita", 74);
		map1.put("Puneet", 66);
		map1.put("Manoj", 77);
		map1.put("Kunal", 74);
		map1.put("Ankita", 67);
		System.out.println(map1);
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// add
		map2.put("Raj", 94);
		map2.put("Shiva", 78);
		map2.put("Ankita", 74);
		map2.put("Puneet", 66);
		map2.put("Manoj", 77);
		map2.put("Kunal", 74);
		map2.put("Ankita", 67);
	//	map2.put(null, 67);
		System.out.println(map2);
	}

}
