import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws Exception{
		new Main().sol();
	}

	private void sol() throws Exception{
		int N = Integer.parseInt(br.readLine());

		int reverseN = ~N + 1;

		int same = N ^ reverseN;
		
		int cnt = 0;

		for(char ch : Integer.toBinaryString(same).toCharArray()){
			if(ch == '1') cnt++;
		}
		System.out.println(cnt);
	}
	
}