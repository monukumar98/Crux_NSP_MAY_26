package Lec21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Path_Sum_II {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
			List<List<Integer>> ans = new ArrayList<>();
			List<Integer> ll = new ArrayList<>();
			hasPathSum(root, targetSum, ll, ans);
			return ans;
		}

		public void hasPathSum(TreeNode root, int targetSum, List<Integer> ll, List<List<Integer>> ans) {
			if (root == null) {
				return;
			}
			if (root.left == null && root.right == null) {
				if (targetSum - root.val == 0) {
					ll.add(root.val);
					ans.add(new ArrayList<Integer>(ll));
					ll.remove(ll.size() - 1);

				}
			}
			ll.add(root.val);
			hasPathSum(root.left, targetSum - root.val, ll, ans);
			hasPathSum(root.right, targetSum - root.val, ll, ans);
			ll.remove(ll.size() - 1);

		}
	}

}
