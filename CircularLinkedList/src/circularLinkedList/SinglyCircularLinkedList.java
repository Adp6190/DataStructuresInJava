package circularLinkedList;

import java.util.Scanner;

class SinglyCircularLinkedList {
	// NOde class
	static class Node {
		// Node class fields
		private int data;
		private Node next;

		// Node class methods
		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	// LIst class fields
	private Node head;

	// list class methods

	public SinglyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void display() {
		System.out.println("List: ");
		// Special1: list is empty, then return
		if (isEmpty())
			return;
		// general: print all nodes in list
		Node trav = head;
		do {
			System.out.println(trav.data);
			trav = trav.next;
		} while (trav != head);
	}

	public void addLast(int val) {
		// create new node and init it
		Node newNode = new Node(val);
		// specail 1:if list is empty, newNode is the first node& make it circular.
		if (isEmpty()) {
			head = newNode;
			newNode.next = head;
		}
		// general:add node at the end
		else {
			// traverse till last node(trav) i.e. the node whose next contains head.
			Node trav = head;
			while (trav.next != head)
				trav = trav.next;
			// newnode's next to head
			newNode.next = head;
			// last node's (trav) next to newnode
			trav.next = newNode;
		}
	}
	
	public void delAll() {
		head.next=null;
		head=null;
	}

}

public class SinglyCircularLinkedList {
public static void main(String[]args) {
	int choice, val, pos;
	SinglyCircularLinkedList list= new SinglyCircularLinkedList();
	Scanner sc=new Scanner(System.in);
			do {
				System.out.println("\n0.Exit \n1.Display \n3. Add Last\n4. Add at Pos\n5. Delete");
				choice =sc.nextInt();
				switch(choice) {
				case 1: //Display
					list.display();
					break;
					
				case 2:	//Add at first
					System.out.println("enter new element: ");
					val=sc.nextInt();
					list.addFirst(val);
					break;
					
				case 3:	//Add Last
					System.out.println("enter new element: ");
					val=sc.nextInt();
					list.addLast(val);
					break;
				case 4: // add at pos
					System.out.println("enter new element " );
					val=sc.nextInt();
					System.out.println("enter element position");
					pos=sc.nextInt();
					list.addAtPos(val,pos);
					break;
				case 0:
					
					break;
					
				}
			}


}
}
