
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // C들의 개수를 기준으로 C이외의 문자의 개수 + 1만큼 덩어리로 나누어줘야 함
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        int notChicken=0;
        int answer = 0;

        for(int i=0; i< N; i++){
            if(S.charAt(i) != 'C'){
                notChicken++;

            }
        }
        int chicken = N - notChicken;
        int leftover = chicken%(notChicken+1);

        // 덩어리로 나누어 주고 덩어리가 남아있지 않다면 치킨을 연속으로 먹을 수 있는 값의 최대값은 다 같음
        if(leftover == 0){
            System.out.println((chicken-leftover)/(notChicken+1));
        } else {
            System.out.println((chicken-leftover)/(notChicken+1) + 1);
        }

    }
}
