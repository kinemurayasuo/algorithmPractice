package practicloof;

import java.io.IOException;
import java.util.Scanner;

public class ApulsBCase 
{
	public static void main(String args[]) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
//		for(int i = 1; i <= a; i++) 
//		{
//			int b = sc.nextInt();
//			int c = sc.nextInt();
//			
//			System.out.println("Case #" + i + ": " + b+c);
//		}
		
		for(int i = 1; i <= a; i++) 
		{
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b+c));
		}
		
	}
}