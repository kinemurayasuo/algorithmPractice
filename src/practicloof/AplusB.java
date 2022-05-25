package practicloof;

import java.util.Scanner;

public class AplusB 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 여기서 얼마나 반복시킬건지 정함
		
		for (int i = 0; i < n; i++) 
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B); // 정하고 더한 값 출력
		}
	}
}
