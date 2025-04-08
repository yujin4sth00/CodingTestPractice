import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		Stack <Integer> stack = new Stack <Integer>();
		
		for (int i = 0; i<N; i++) {
				int h = Integer.parseInt(bf.readLine());
				while (!stack.isEmpty()&&h>=stack.peek()) stack.pop();
				stack.push(h);
			}
		
		System.out.println(stack.size());
	}
}