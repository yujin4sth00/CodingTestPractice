import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String N = br.readLine();
		int[] count = new int[10];
		Arrays.fill(count, 0);
		
		for(int i  = 0 ; i < N.length() ; i++) {
			int number = Integer.parseInt(String.valueOf(N.charAt(i)));
			if(number == 9) { // 9와 6을 하나로 집계
				count[6]++;
			}else {
				count[number]++;
			}
		}
		
		if(count[6] % 2 == 1) {
			count[6] = count[6] / 2 + 1;
		}else {
			count[6] = count[6] / 2;
		}
		
		int max = 0;
		
		for(int i = 0 ; i < count.length ; i++) {
			max = Math.max(max, count[i]);
		}
		
		bw.write(String.valueOf(max));

		br.close();
		bw.flush();
		bw.close();
	}

}