import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] field;   //밭
    static int X, Y;    //밭의 가로, 세로
    static int[] dirX = {-1, 1, 0, 0};
    static int[] dirY = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            field = new boolean[X+2][Y+2];      //맨앞 칸과 맨뒷칸을 비워두고 dfs애서 if범위 검사를 생략할 수 있다.
            int count = 0; //배추흰지렁이 수 = 연결된 밭의 수

            //밭에 배추를 심는다.
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()) + 1;
                int y = Integer.parseInt(st.nextToken()) + 1;
                field[x][y] = true;
            }

            //배추 밭 탐색
            for (int i = 1; i <= X; i++) {
                for (int j = 1; j <= Y; j++) {
                    if (field[i][j]) {
                        count++;
                        dfs(i, j);
                    }
                }
            }
            bw.write(count + "\n");
        }

        br.close();
        bw.close();
    }

    static void dfs(int y, int x) {
        field[y][x] = false;
        //상하좌우 탐색
        for(int i=0; i<4; i++){
            int newY = y + dirY[i];
            int newX = x + dirX[i];

            if(field[newY][newX])
                dfs(newY, newX);
        }
    }
}