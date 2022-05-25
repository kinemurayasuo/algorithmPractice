package test00;
import java.util.Scanner;

public class test02 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		// 시
		if(a == 0) 
		{
			System.out.print(a+23 + " ");
			
		}
		if(a > 0 && a <= 23) 
		{
			System.out.print(a-1 + " ");
		}
		
		// 분
		if(b > 45 && b <= 60) 
		{
			System.out.print(b-45 + " ");
			
		}
		if(b >= 0 && b < 45) 
		{
			System.out.print(b+15 + " ");
		}
		
		
	}
}
