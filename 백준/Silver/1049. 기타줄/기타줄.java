import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Min = Integer.MAX_VALUE;

        int[] unit = new int[M];
        int[] pack = new int[M];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            pack[i] = Integer.parseInt(st.nextToken());
            unit[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(unit);
        Arrays.sort(pack);

        Min = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
        Min = Math.min(Min, (N / 6) * pack[0] + (N % 6) * unit[0]);

        System.out.println(Min);
    }
}
