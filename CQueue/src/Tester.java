class Cqueue
{
	private int size;
	private int []arr;
	private int rear, front;
	
	public Cqueue() 
	{
		size=5;
		arr=new int[size];
		rear=front=size-1;
	}
	public Cqueue(int s) 
	{
		size=s;
		arr=new int[size];
		rear=front=size-1;
	}
	public void addElement(int val) throws Exception
	{
		if(!isFull())
		{
			rear=(rear+1)%size;  
			arr[rear]=val;
		}
		else
			throw new Exception("Overflow!");
	}
	public int removeElement() throws Exception
	{
		if(!isEmpty())
		{
			front=(front+1)%size;
			return arr[front];
		}
		else
			throw new Exception("Underflow!");
			
	}
	public boolean isEmpty() {
		return rear==front;
	}
	public boolean isFull() {
		return front==(rear+1)%size;
	}
}

public class Tester {

	public static void main(String[] args) throws Exception {
		Cqueue cq=new Cqueue();
		cq.addElement(12);
		cq.addElement(20);
		cq.addElement(123);
		cq.addElement(11);
		//cq.addElement(23);
		System.out.println(cq.removeElement());
		System.out.println(cq.removeElement());
		System.out.println(cq.removeElement());
		System.out.println(cq.removeElement());
		cq.addElement(11);
		System.out.println(cq.removeElement());	
	}
}
