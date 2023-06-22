package LinearQueueMain;

class Queue
{
	private int size;
	private int [] arr;
	private int rear,front;
public Queue()
{
	size=5;
	arr=new int[size];
	rear=front=-1;
}
	public Queue(int s)
	{
		size=s;
		arr= new int[size];
		rear=front=-1;
	}
	public boolean isFull() {
		return rear==size-1;
	}
	public boolean isEmpty() {
		return rear==front;
	}
	
	public void addElement(int val) throws Exception {
		if(!isFull())
			
		arr[++rear]=val;
		else 
			throw new Exception("Overflow");
	}
	public int removeElement() throws Exception {
		if(!isEmpty())
			
		return arr[++front];
		else 
			throw new Exception("Underflow");
	}
}



public class LinearQueue {
public static void main(String[]args) throws Exception {
	Queue q=new Queue();
	q.addElement(1);
	q.addElement(2);
	q.addElement(3);
	q.addElement(4);
	q.addElement(4);

	System.out.println(q.removeElement());
	System.out.println(q.removeElement());
	System.out.println(q.removeElement());
	System.out.println(q.removeElement());
	System.out.println(q.removeElement());
	
}
}
