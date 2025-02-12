import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] array = br.readLine().toCharArray();
		int oneCount = 0;
		int zeroCount = 0;
		char current = array[0];
		if(current == '1')
			oneCount++;
		else if(current == '0')
			zeroCount++;
		
		for(int i = 1; i < array.length; i++) {
			if(current != array[i]) {
				current = array[i];
				if(current == '1')
					oneCount++;
				else if(current == '0')
					zeroCount++;
			}
		}
		
		if(zeroCount == 0 || oneCount == 0)
			bw.write(0 + "\n");
		else if(zeroCount == oneCount){
			bw.write(zeroCount + "\n");
		}
		else {
			if(oneCount > zeroCount)
				bw.write(zeroCount + "\n");
			else if(oneCount < zeroCount)
				bw.write(oneCount + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}