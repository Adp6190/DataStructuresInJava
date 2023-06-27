package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private BinaryTreeNode root;

	public BinaryTree() {
		root = null;
	}

	public void createTree01() {
		BinaryTreeNode node1 = new BinaryTreeNode(5);
		BinaryTreeNode node2 = new BinaryTreeNode(1);
		BinaryTreeNode node3 = new BinaryTreeNode(4);
		BinaryTreeNode node4 = new BinaryTreeNode(7);

		node1.leftChild = node2;
		node1.rightChild = node3;

		node2.leftChild = node4;

		root = node1;

	}

	private int count;

	public void preOrder() {
		// Wrapper method to call private preOrder(
		count = 0;
		// preOrder(root);
		System.out.println("count =  " + count);

	}

	private void preOrder(BinaryTreeNode root) {
		++count;
		if (root == null) {
			return;
		}

		System.out.println(root.data);
		preOrder(root.leftChild);
		preOrder(root.rightChild);

	}

	private void preOrderOptimised(BinaryTreeNode root) {
		++count;
		if (root == null) {
			return;
		}
		System.out.println(root.data);
		if (root.leftChild != null) { // corner case if left child empty
			preOrderOptimised(root.leftChild);
		}
		if (root.rightChild != null) {
			preOrderOptimised(root.rightChild);
		}

	}

	public void levelOrder() {
		if (root == null) {
			return;
		}

		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			BinaryTreeNode currentNode = q.remove();
			System.out.println(currentNode.data + " ");
			if (currentNode.leftChild != null) {
				q.add(currentNode.leftChild);
			}
			if (currentNode.rightChild != null) {
				q.add(currentNode.rightChild);
			}

		}
		System.out.println("");
	}

	public void levelOrderMultipleLines() {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			BinaryTreeNode currentNode = q.remove();

			if (currentNode == null) {
				// end of a level
				System.out.println("");
				if (!q.isEmpty()) {
					q.add(null); // to mark end of a level
				}

				continue;

			}
			System.out.println(currentNode.data + " ");
			if (currentNode.leftChild != null) {
				q.add(currentNode.leftChild);
			}
			if (currentNode.rightChild != null) {
				q.add(currentNode.rightChild);
			}

		}
	}

}
