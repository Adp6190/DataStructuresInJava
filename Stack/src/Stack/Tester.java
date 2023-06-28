package Stack;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) throws Exception {
		Stack s1=new Stack(100);
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number:");
		num=sc.nextInt();
		while(num>0)
		{
			s1.push(num%2);
			num=num/2;
		}
		System.out.println("Equvalent Binary:");
		while(!s1.isEmpty())
		{
			System.out.print(s1.pop()+"  ");
		}		
	}
}


