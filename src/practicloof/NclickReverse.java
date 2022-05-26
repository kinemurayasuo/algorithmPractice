package practicloof;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class NclickReverse 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		br.close();
		// 감소식
//		for(int i = a; i > 0; i--) 
//		{
//			System.out.println(i);
//		}
		
		// while 문 이용한 조건식
		while(a > 0) 
		{
			System.out.println(a);
			a--;
		}
	}
}
