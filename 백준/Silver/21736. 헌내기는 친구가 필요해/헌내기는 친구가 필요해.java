import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static char[][] graph;
    static boolean[][] visited;
    // 상, 하, 좌, 우 이동을 위한 delta 배열 선언
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    // BFS 사용을 위한 큐 선언
    static Deque<int[]> queue = new ArrayDeque<>();
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new char[N][M];
        visited = new boolean[N][M];
        
        // 그래프 입력
        for(int i=0; i<N; i++) {
            graph[i] = br.readLine().toCharArray();
            // I의 위치를 아직 찾지 못했다면
            if(queue.isEmpty()) {
                // I의 위치를 찾고 큐에 삽입
                for(int j=0; j<M; j++) {
                    if(graph[i][j] == 'I') {
                        queue.addLast(new int[]{i, j});
                        break;
                    }
                }
            }
        }
        bfs();
        // 만난 사람이 1명이라도 있으면 출력, 없으면 'TT' 출력
        System.out.println(answer>0 ? answer : "TT");

    }
    
    static void bfs() {
        while(!queue.isEmpty()) {
            int[] tmp = queue.removeFirst();
            int x = tmp[0];
            int y = tmp[1];
            // 상, 하, 좌, 우 이동
            for(int i=0; i<4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                // 좌표가 범위를 벗어나면 다른 방향 시도
                if(nx<0 || ny<0 || nx>=N || ny>=M) {
                    continue;
                }
                // 벽이 아니고 방문한 적이 없으면 체크
                if(graph[nx][ny] != 'X' && !visited[nx][ny]) {
                    // 만약 사람을 만났다면 카운트
                    if(graph[nx][ny] == 'P') {
                        answer++;
                    }
                    visited[nx][ny] = true;
                    queue.addLast(new int[]{nx, ny});
                }
            }
        }
    }
}