import java.util.Scanner;

public class Main {
  static int[][] map;
  static int[][] v;
  static int N;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    N = scanner.nextInt();
    map = new int[N][N];
    v = new int[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        map[i][j] = scanner.nextInt();
        v[i][j] = -1;
      }
    }
    System.out.println(dfs(0, 0) ? "HaruHaru" : "Hing");
  }

  static boolean dfs(int x, int y) {

    if (x < 0 || x >= N || y < 0 || y >= N || v[x][y] == 1) {
      return false;
    }
    if (x == N - 1 && y == N - 1) {
      return true;
    }
    v[x][y] = 1;
    int jump = map[x][y];
    return dfs(x + jump, y) || dfs(x, y + jump);
  }
}