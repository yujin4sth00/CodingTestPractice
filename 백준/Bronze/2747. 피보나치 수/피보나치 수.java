import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        dp = new int[num + 1];
        System.out.print(fibonacci(num));
    }

    public static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        }
        if (dp[i] != 0) {
            return dp[i];
        }
        dp[i] = fibonacci(i-1) + fibonacci(i-2);
        return dp[i];
    }
}