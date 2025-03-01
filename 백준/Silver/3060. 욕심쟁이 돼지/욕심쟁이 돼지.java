import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(in.readLine());
            String[] input = in.readLine().split(" ");

            int day = 1;
            long firstsum = 0;

            for (int i = 0; i < 6; i++)
                firstsum += Integer.parseInt(input[i]);
            while (firstsum <= N) {
                firstsum *= 4;
                day++;
            }

            sb.append(day).append("\n");
        }

        System.out.print(sb);
    }
}
