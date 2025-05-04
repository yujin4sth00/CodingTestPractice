import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    while(N --> 0) {

      String[] input = br.readLine().split(" ");
      int nodes = Integer.parseInt(input[0]);
      int edges = Integer.parseInt(input[1]);

      ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
      for(int i = 0; i <= nodes; i++) {
        graph.add(new ArrayList<>());
      }

      // 양방향 인접그래프
      for(int i = 0; i < edges; i++) {
        String[] edge = br.readLine().split(" ");
        int start = Integer.parseInt(edge[0]);
        int end = Integer.parseInt(edge[1]);

        graph.get(start).add(end);
        graph.get(end).add(start);
      }

      System.out.println(solution(graph));
    }
  }

  private static String solution(ArrayList<ArrayList<Integer>> graph) {

    // 이분그래프를 위한 색상 배열
    int[] colors = new int[graph.size()];
    boolean[] visited = new boolean[graph.size()];

    // BFS
    for(int start = 1; start < graph.size(); start++) {
      if(visited[start]) continue;

      Deque<Integer> que = new ArrayDeque<>();
      que.add(start);
      colors[start] = 1;

      while(!que.isEmpty()) {
        int node = que.pollFirst();
        visited[node] = true;

        // 이분 가능 여부 판단
        for(Integer neighbor : graph.get(node)){
          // 인접한 노드와 서로 같은 색이라면 "이분 그래프" 아님
          if(colors[neighbor] == colors[node]) {
            return "NO";
          }

          if(colors[neighbor] != 0) continue; // 이미 색이 있다면 지나감.

		  //상반되는 색상으로 인접노드 색깔 지정
          colors[neighbor] = (colors[node] == 1 ? 2 : 1);	
          que.addLast(neighbor);
        }
      }
    }
    return "YES";
  }
}
