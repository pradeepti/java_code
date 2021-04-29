package java_code;

import java.util.LinkedList;
import java.util.Queue;

public class BTFromArray {
	Queue<TreeNode> q = new LinkedList<TreeNode>();

	public void CreateTree(int[] arr, TreeNode root) {
		root = new TreeNode(arr[0]);
		q.add(root);
		TreeNode n;
		n = q.remove();
		for (int i = 1; i < arr.length; i++) {
			if (n.left == null) {
				n.left = new TreeNode(arr[i]);
				q.add(n.left);
			} else {
				if (n.right == null) {
					n.right = new TreeNode(arr[i]);
					q.add(n.right);
				}
			}
			n = q.remove();
		}
		InorderTraversal(root);
	}

	public void InorderTraversal(TreeNode root) {

		if (root == null)
			return;

		InorderTraversal(root.left);
		System.out.print(root.value + "\t");
		InorderTraversal(root.right);

	}

	public void insert(TreeNode root, int[] arr) {
		// method1
		CreateTree(arr, root);
	}

	public static void main(String[] args) {

		TreeNode root = null;

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		BTFromArray b = new BTFromArray();

		b.insert(root, arr);

	}
}
