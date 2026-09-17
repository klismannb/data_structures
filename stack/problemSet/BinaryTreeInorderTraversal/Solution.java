/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
package BinaryTreeInorderTraversal;

import java.util.*;

public class Solution {

	public void traverseTree(TreeNode node, Stack<Integer> stack) {
		if (node == null) {
			return;
		}

		traverseTree(node.left, stack);

		stack.add(node.val);

		traverseTree(node.right, stack);
	}

	public List<Integer> inorderTraversal(TreeNode root) {

		Stack<Integer> stack = new Stack<>();

		traverseTree(root, stack);

		return new ArrayList<Integer>(stack);
	}

	public static void main(String[] args) {

		Solution solution = new Solution();

		// Caso 1: root = [1,2,3,4,5,null,8,null,null,6,7,9]
		//
		// 1
		// / \
		// 2 3
		// / \ \
		// 4 5 8
		// / \ /
		// 6 7 9
		//
		TreeNode n4 = new TreeNode(4);
		TreeNode n6 = new TreeNode(6);
		TreeNode n7 = new TreeNode(7);
		TreeNode n9 = new TreeNode(9);

		TreeNode n5 = new TreeNode(5, n6, n7);
		TreeNode n8 = new TreeNode(8, n9, null);

		TreeNode n2 = new TreeNode(2, n4, n5);
		TreeNode n3 = new TreeNode(3, null, n8);

		TreeNode root1 = new TreeNode(1, n2, n3);

		System.out.println("Caso 1 -> " + solution.inorderTraversal(root1));
		System.out.println("Esperado: [4, 2, 6, 5, 7, 1, 3, 9, 8]");

		// Caso 2: root = [1]
		TreeNode root2 = new TreeNode(1);

		System.out.println("Caso 2 -> " + solution.inorderTraversal(root2));
		System.out.println("Esperado: [1]");

		// Caso 3 (bônus): root = []
		System.out.println("Caso 3 -> " + solution.inorderTraversal(null));
		System.out.println("Esperado: []");

		TreeNode root3 = new TreeNode();

		System.out.println("Caso 4 -> " + solution.inorderTraversal(root3));
	}

	static class TreeNode {
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

}
