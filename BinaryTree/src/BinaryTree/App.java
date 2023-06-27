package BinaryTree;

public class App {

	public static void main(String[]args) {
		BinaryTree bt01= new BinaryTree();
		
		bt01.createTree01();
		System.out.println("preorder traversal");
		bt01.preOrder();
		System.out.println("level order traversal");
		bt01.levelOrder();
		System.out.println("level order traversal multiple lines");
		bt01.levelOrderMultipleLines();
	}
}
