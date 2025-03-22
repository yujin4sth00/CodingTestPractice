import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;
        int length = String.valueOf(N).length();  // N의 자릿수 계산
       

        for (int i = Math.max(1, N - (length * 9)); i < N; i++) {
            int number = i;
            int sum = 0;

            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                result = i;
                break;
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
