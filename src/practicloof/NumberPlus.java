package practicloof;

import java.util.Scanner;
public class NumberPlus 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// a값은 1 <= a <= 10000 값이 주이짐
		int a = sc.nextInt();
		sc.close();
		// 개수 의 합 선언
		int sum = 0;
		
		// 반복문 실행
		for(int i = 0; i <= a; i++) 
		{
			sum += i;
			
		}
		System.out.println(sum);
	}
}
