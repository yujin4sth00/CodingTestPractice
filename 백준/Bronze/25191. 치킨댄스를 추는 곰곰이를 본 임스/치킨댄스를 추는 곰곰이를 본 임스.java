import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chicken = Integer.parseInt(br.readLine()); // 치킨 개수

        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken()); // 콜라 개수
        int beer = Integer.parseInt(st.nextToken()); // 맥주 개수

        int total = 0; // 시킬 수 있는 치킨 수
        while (total < chicken) { // 치킨집 치킨수 초과 전까지 반복
            // with 콜라 2개
            if (1 < coke) {
                coke -= 2;
                total++;
                
            // with 맥주 1개
            } else if (0 < beer) {
                beer--;
                total++;

            // 콜라 2개나 맥주 1개가 없을시
            } else {
                break;
            }
        }

        System.out.println(total);
    }
}