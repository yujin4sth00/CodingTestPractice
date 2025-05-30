import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        //입력값 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //결과값 출력하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        //넘어온 날이 3일일 때
        if(D == 3)
            bw.write( 1 + "\n" + (K-1));
        else{	//3일보다 클 때
            int x = 1, y = 1;	// x + y
            //D번째 떡의 개수 ax + by 형태 구하기
            for(int i=4;i<=D;i++){
                int temp  = y;
                y = x + y;
                x = temp;
            }
            int size = K/y;	//y 입력 가능한 최대값
            //x가 자연수가 되는 y의 최대값 탐색!
            for(int i = size-1;i>=0;i--){
                if((K - (i*y)) % x == 0){	//x가 자연수가 되는 y의 최대값 성립!
                    //x의 값과 y의 값 BufferedWriter 저장
                    bw.write( (K - (i*y)) / x+ "\n" + i);
                    break;
                }
            }
        }
        bw.flush();		//결과 출력
        bw.close();
        br.close();
    }
}