package linkedlistdouble;

public class DoublyLinkedList implements DoubleLinkedListIntf{

	private Node head, tail;

	public DoublyLinkedList() {
		head = tail = null;
	}

	public void insert(int data) {

		// creating new node and making memory for new element say newnode
		Node newnode = new Node();
		newnode.setData(data);
		newnode.setNext(null);
		newnode.setPrev(null);
		// if list is empty?
		// if head is empty
		if (head == null && tail == null) {
			// making newnode as first and last element of list
			head = tail = newnode;
			// stop;
			return;
		}
		//traverse list to find- current node
		//setting current to first node(head)
		Node current=head;
		while(current!=null) {
			if(current.getData()>newnode.getData()) {
				break;
			}
			current=current.getNext();
		}
		//adding  as first node
		if(current==head) {
			head.setPrev(newnode);
			newnode.setNext(head);
			head=newnode;
			return;
		}
			//if adding after last node?
			if(current==null) {
				tail.setNext(newnode);
				newnode.setPrev(tail);
				tail=newnode;
				return;
			}
			
	//Add new node between current and current's previous node
			newnode.setNext(current);
			newnode.setPrev(current.getPrev());
			current.getPrev().setNext(newnode);
			current.setPrev(newnode);
			
		
	
	
	}
		
	public void printForward() {
		Node current;
		current=head;
		while(current!=null) {
			System.out.println(current.getData());
			current=current.getNext();
		}
		
		
	}
	public void printBackward() {
		Node current;
		current=tail;
		while(current!=null) {
			System.out.println(current.getData());
		current=current.getPrev();
		}
	}


public static void main(String[] args) {
		DoublyLinkedList d1=new DoublyLinkedList();
		d1.insert(20);
		d1.insert(30);
		d1.insert(40);
		System.out.println("Doubly Linked list in backward direction");
		d1.printBackward();
		System.out.println("Doubly Linked list in forward direction");
		d1.printForward();
}
}
