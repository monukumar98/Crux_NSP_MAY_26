package Lec24;

import java.util.*;

import Lec24.Bottom_view_of_binary_tree.Solution.NodePair;

public class Bottom_view_of_binary_tree {
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
		public List<Integer> BottomView(TreeNode root) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			Queue<NodePair> q = new LinkedList<>();
			q.add(new NodePair(root, 0));
			while (!q.isEmpty()) {
				NodePair r = q.poll();
				map.put(r.vt, r.node.val);
				if (r.node.left != null) {
					q.add(new NodePair(r.node.left, r.vt - 1));
				}
				if (r.node.right != null) {
					q.add(new NodePair(r.node.right, r.vt + 1));
				}
			}
			List<Integer> ll = new ArrayList<>();
			for (int x : map.keySet()) {
				ll.add(map.get(x));
			}
			return ll;
		}

		class NodePair {
			TreeNode node;
			int vt;

			public NodePair(TreeNode node, int vt) {
				// TODO Auto-generated constructor stub
				this.node = node;
				this.vt = vt;
			}
		}
	}
}
