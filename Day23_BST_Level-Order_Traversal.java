import java.util.*;
import java.io.*;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

      
class Solution {

	static void levelOrder(Node root) {
		
		// create a node queue
		Queue<Node> queue = new LinkedList<>();
		// Add root Node to Queue
		queue.add(root);
		// until the queue is empty
		while (!queue.isEmpty()){
			Node node = queue.remove();
			// print value
			System.out.printf("%d ", node.data);
			// if left node not null add child node to the queue
			if (node.left != null)
				queue.add(node.left);
			// if right node not null add child node to the queue
			if (node.right != null)
				queue.add(node.right);
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}