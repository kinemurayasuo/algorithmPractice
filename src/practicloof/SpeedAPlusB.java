package practicloof;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpeedAPlusB 
{
	// Scanner 방식이 아닌 하드를 통해 읽어내서 빠르게 입력 시키는 buffer 방식을 사용
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < num; i++) 
		{
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a + b);
		}
	}
}
