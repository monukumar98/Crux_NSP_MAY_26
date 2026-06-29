package Lec13;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<Integer> ll = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Combinations(candidates, target, ll, 0, ans);
		System.out.println(ans);
	}

	public static void Combinations(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
		if (amount == 0) {
			// System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				Combinations(coin, amount - coin[i], ll, i, ans);
				ll.remove(ll.size() - 1);
			}
		}

	}

}
