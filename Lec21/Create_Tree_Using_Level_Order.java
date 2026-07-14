package Lec21;
import java.util.*;
public class Create_Tree_Using_Level_Order {
	private class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}

	private Node root;
	public Create_Tree_Using_Level_Order() {
		// TODO Auto-generated constructor stub
		createTree();
	}
	private void createTree() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int item =sc.nextInt();
		Node nn = new Node(item);
		root=nn;
		q.add(nn);
		while(!q.isEmpty()) {
			Node r=q.poll();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node n= new Node(c1);
				r.left=n;
				q.add(n);
			}
			if(c2!=-1) {
				Node n= new Node(c2);
				r.right=n;
				q.add(n);
			}
		}
		
	}
}

















