import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char seat[][] = new char[n][m];
        int result =0;

		//행렬 생성
        for(int i=0;i<n;i++){
          String str = br.readLine();
          for(int j=0;j<m;j++){
            seat[i][j] = str.charAt(j);
          }
        }

		//행의 개수만큼 반복
        for(int i=0;i<n;i++){
        //1일때 +1이 되는 window 변수
          int window = 0;
		//m이 k 이상일 때
          if(m>=k){
          //행의 첫 k구간 탐색
            for(int j=0;j<k;j++){
              if(seat[i][j]=='1')
                window++;
            }
			//첫 구간 답 확인
            if(window==0)
              result++;
            
            //행의 나머지 열 값들 확인
            for(int l=k;l<m;l++){
            	//나가는 열
              if(seat[i][l-k]=='1')
                window--;
                // 들어오는 열
              if(seat[i][l]=='1')
                window++;
                // 결과 확인
              if(window==0)
                result++;  
            }
          }
        }

        sb.append(result);
        System.out.println(sb);
        br.close();
    }
}