import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int D;
    static ArrayList<int[]> arr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        D = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int dist = sc.nextInt();
            arr.add(new int[]{start, end, dist});
        }

        int[] dp = new int[10000];
        for (int i = 0; i < 10000; i++) {
            dp[i] = i;
        }

        for (int i = 1; i <= D; i++) {
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);
            for (int j = 0; j < N; j++) {
                int[] tmp = arr.get(j);
                dp[tmp[1]] = Math.min(dp[tmp[1]], dp[tmp[0]] + tmp[2]);
            }
        }
        System.out.println(dp[D]);
    }
}