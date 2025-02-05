import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int J = Integer.parseInt(br.readLine());

        int result = 0;

        int bucket = 1;

        for (int i = 0; i < J; i++) {
            int drop = Integer.parseInt(br.readLine());

            if (drop >= bucket && drop <= bucket + M - 1) {
                continue;
            }

            if (bucket < drop) {
                while (true) {
                    if (drop >= bucket && drop <= bucket + M - 1) {
                        break;
                    }
                    bucket++;
                    result++;
                }
            } else {
                while (true) {
                    if (drop >= bucket && drop <= bucket + M - 1) {
                        break;
                    }
                    bucket--;
                    result++;
                }
            }

        }

        bw.write(String.valueOf(result));
        bw.flush();
    }
}