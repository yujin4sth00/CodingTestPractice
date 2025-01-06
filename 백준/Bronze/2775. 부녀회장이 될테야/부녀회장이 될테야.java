import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 수
        for (int t = 0; t < T; t++) {
            int k = sc.nextInt(); // 층 수
            int n = sc.nextInt(); // 호 수

            // 아파트 배열 초기화
            int[][] apartment = new int[k + 1][n + 1];

            // 0층 초기화
            for (int i = 1; i <= n; i++) {
                apartment[0][i] = i;
            }

            // 1층 이상 계산
            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    apartment[i][j] = apartment[i - 1][j] + apartment[i][j - 1];
                }
            }

            // 결과 출력
            System.out.println(apartment[k][n]);
        }

        sc.close();
    }
}
