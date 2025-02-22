import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int res = 0;
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		ArrayList<Integer>[] friend = new ArrayList[n];
		for (int i = 0; i < n; i++) {
			friend[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
            // 인덱스로 변환하기 쉽게 하기 위해 -1 해주는 코드로 수정
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;
			friend[a].add(b);
			friend[b].add(a);
		}
         // 방문여부
		boolean[] visited = new boolean[n];
        // 상근이(0번 노드) 방문 처리
		visited[0] = true;

        // bfs
		Queue<Integer> q = new LinkedList<Integer>();

		q.add(0); // 상근이(0번 노드)부터 탐색 시작
		int depth= 0;  // 현재 depth
        // bfs 탐색 시작
		while (!q.isEmpty()) {
			int size = q.size();  // 현재 큐에 있는 노드 수 (현재 depth에 있는 노드들)
			for (int i = 0; i < size; i++) {
				int x = q.poll();
				for (int nowx : friend[x]) {
					if (visited[nowx])
						continue;
					visited[nowx] = true;
					res++;
					q.add(nowx);
				}
			}
			depth++;
			if(depth==2) break;
		}

		System.out.println(res);
	}
}
