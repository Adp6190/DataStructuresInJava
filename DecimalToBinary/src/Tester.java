import java.util.Scanner;

class Stack{
	private int size;
	private int [] arr;
	private int top;
	
	public Stack() { // default ctor for Stack class
		size = 5;
		arr = new int[size];
		top = -1;
	}

	public Stack(int s) {
		size = s;
		arr = new int[size];
		top = -1;
	}
	public boolean isFull() {
		return top==size-1;
	}
	public boolean isEmpty(){
		return top==-1;
	}

	public void push(int val) throws Exception {
		if(!isFull())
		arr[++top] = val;
		else 
			throw new Exception ("overflow");
	}

	public int pop() throws Exception {
		if(!isEmpty())
		return arr[top--];
		else 
			throw new Exception("is empty");
	}
	}
 
public class Tester {
	public static void main(String[] args) throws Exception {
	Stack s1=new Stack(100);
	Scanner sc= new Scanner(System.in);
	int num;
	System.out.println(" Enter Number:");
	num = sc.nextInt();
	while(num>0) {
		s1.push(num%2);
		num=num/2;
	}
	System.out.println("equivalent binary: ");
	while(!s1.isEmpty()) {
		System.out.print(s1.pop()+ " ");
	}
    sc.close();         
  
    
    
    
		
		
	}

}
