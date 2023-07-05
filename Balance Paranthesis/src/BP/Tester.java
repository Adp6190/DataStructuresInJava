package BP;

import java.util.Scanner;

class Stack {
	private int size;
	private int[] arr;
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
		return top == size - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int val) throws Exception {
		if (!isFull())
			arr[++top] = val;
		else
			throw new Exception("overflow");
	}

	public int pop() throws Exception {
		if (!isEmpty())
			return arr[top--];
		else
			throw new Exception("Underflow");
	}

	public int peep() throws Exception {
		if (!isEmpty())
			return arr[top];
		else
			throw new Exception("Underflow");
	}

	static String infixToPostfix(String exp) {
		String result = new String("");

		return result;
	}

}

public class Tester {
		

			
		


		public static void main(String[] args) throws Exception{
			Scanner sc = new Scanner(System.in);
			Stack s1 = new Stack(100);
			System.out.println("Enter parantheses");
			char [] infix=new char[100];
//			char [] postfix =new char[50];

			infix=(sc.next()).toCharArray();
		
			int i=0,j=0;
			for(char c:infix) {
				
				
				if((c=='(' || c=='[' || c== '{' ) && (!s1.isEmpty())){
					s1.push(c);
				}
					else if
					((s1.peep()==')'|| s1.peep()==']' || s1.peep()=='}' ) && (!s1.isEmpty())) {
					
						if (((char) s1.peep() == '(' && c == ')')
								|| ((char) s1.peep() == '{' && c == '}')
								|| ((char) s1.peep() == '[' && c == ']')) {
							s1.pop();
					}else {
						System.out.println("Not Balanced");
					}
				} else {
					if ((c == ']' || c == '}' || c == ')')) {
					System.out.println("Not Balanced");	
					}
					
					
				}
				if (s1.isEmpty())
					System.out.println("Balanced Parenthisis"); 
				else
					System.out.println(" not Balanced Parenthisis");

			}
			
				
				
			}


			

		

}


