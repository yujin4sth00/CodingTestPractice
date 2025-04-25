import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[] dx = {-1, 0 , 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] cube = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                cube[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer += 2 * N * M;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < 4; k++) { //사방 탐색
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx < 0 || ny < 0 || nx > N - 1 || ny > M - 1) { //비교대상이 없으면
                        answer += cube[i][j]; //현재 사각형 개수를 더해준다.
                        continue;
                    }
                    if(cube[nx][ny] < cube[i][j]) { // 비교 대상 < 현재위치 
                        answer += cube[i][j] - cube[nx][ny];
                    }
                }
            }
        }
        sb.append(answer).append("\n");
        System.out.println(sb);
    }
}