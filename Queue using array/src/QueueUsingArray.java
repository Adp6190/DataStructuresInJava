
public class QueueUsingArray {

	
	private int size=5;
	private int front,rear;
	private int[]queue;
	
	public QueueUsingArray() {
		size=5;
		queue=new int[size];
		rear=front=-1;
	}
	public QueueUsingArray(int s) {
		size=5;
		queue= new int[size];
		rear=front=-1;
	}
	public boolean isFull(){
		if(rear==(size-1))
			return true;
		else
			return false;
	}
	public boolean isEmpty() {
		if(front==rear)
			return true;
		else
			return false;
		
	}
	
	public void AddQ(int element)throws Exception{
		if(isFull())
			throw new Exception("is full");
		else
			rear=rear+1;
		queue[rear]=element;
	}
	
	public int removeQ() throws Exception{
		if(isEmpty())
			throw new Exception("is empty");
		else
			front=front+1;
		return queue[front];
	}
	
	
}
