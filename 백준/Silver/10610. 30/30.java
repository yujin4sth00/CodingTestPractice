import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nStr = br.readLine();
		int sum = 0;

		char[] charArr = nStr.toCharArray();
		Arrays.sort(charArr);	
		int len = charArr.length;

		StringBuilder sb = new StringBuilder();
		for(int i = len - 1; i >= 0; i--) {
			int num = charArr[i] - '0';
			sum += num;
			sb.append(num);
			
		}
				
		if(charArr[0] != '0' || sum % 3 != 0) {	
			System.out.println(-1);
			return;
		}
		
		System.out.println(sb.toString());
	}
}