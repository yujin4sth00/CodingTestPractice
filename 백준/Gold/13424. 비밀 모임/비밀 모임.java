import java.io.*;
import java.util.*;

public class Main {

    static int INF = 987654321;
    static int v, e;
    static int[][] dist;
    static List<List<Integer>> graph;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= t; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            v = Integer.parseInt(st.nextToken());
            e = Integer.parseInt(st.nextToken());

            dist = new int[v + 1][v + 1];
            for (int i = 1; i <= v; i++) {
                Arrays.fill(dist[i], INF);
                dist[i][i] = 0;
            }

            graph = new ArrayList<>();
            for (int i = 0; i <= v; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 1; i <= e; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                graph.get(from).add(to);
                graph.get(to).add(from);
                dist[from][to] = cost;
                dist[to][from] = cost;
            }

            for (int k = 1; k <= v; k++) {
                for (int i = 1; i <= v; i++) {
                    for (int j = 1; j <= v; j++) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }

            int k = Integer.parseInt(br.readLine());
            int[] ans = new int[v + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < k; i++) {
                int startV = Integer.parseInt(st.nextToken());

                for (int j = 1; j <= v; j++) {
                    ans[j] += dist[startV][j];
                }
            }

            int result = Integer.MAX_VALUE;
            int res = 0;
            for (int i = 1; i <= v; i++) {
                if (ans[i] < result) {
                    result = ans[i];
                    res = i;
                }
            }

            sb.append(res).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}