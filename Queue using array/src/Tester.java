import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws Exception{
		QueueUsingArray q = new QueueUsingArray();
//		System.out.println("enter size of array");
//		Scanner sc= new Scanner(System.in);
				
		q.AddQ(20);
		q.AddQ(30);
		q.AddQ(90);
		q.AddQ(30);
		
		System.out.println(q.removeQ());				// FIRST IN FIRST OUT BEHAVIOR
		System.out.println(q.removeQ());

	}

}
