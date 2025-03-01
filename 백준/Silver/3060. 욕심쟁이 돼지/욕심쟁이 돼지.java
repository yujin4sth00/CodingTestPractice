import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(in.readLine());

        for (int tc = 0; tc < T; tc++) {
            int N = Integer.parseInt(in.readLine());

            // 한 줄의 입력을 공백 기준으로 나누어 배열로 저장
            String[] input = in.readLine().split(" ");

            int day = 1;
            long sum = 0;

            // 돼지 6마리의 초기 사료 소비량을 sum에 더함
            for (int i = 0; i < 6; i++)
                sum += Integer.parseInt(input[i]);

            // 매일 사료량이 4배 증가, N을 초과하는 첫날 찾기
            while (sum <= N) {
                sum *= 4;
                day++;
            }

            sb.append(day).append("\n");
        }

        System.out.print(sb);
    }
}
