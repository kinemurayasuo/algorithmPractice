package practiceif;

import java.util.Scanner;

public class ovenClock 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		a += c / 60; // 정수 나누기 소수 0
		b += c % 60; // 정수 나머지 60보다 아래일시 소수 나와서 0
		
		if(b >= 60) 
		{
			a += 1;
			b -= 60;
		}
		if(a >= 24)
		{
			a -= 24;
		}
		
		System.out.println(a + " " + b);
		
	}
}
