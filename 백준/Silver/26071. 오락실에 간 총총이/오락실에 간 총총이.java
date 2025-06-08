
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int minx = 1501; 
        int maxx = -1;
        int miny = 1501;
        int maxy = -1;


        for (int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++){
                if (str.charAt(j) == 'G') {
                    minx = Math.min(i, minx);
                    maxx = Math.max(i, maxx);
                    miny = Math.min(j, miny);
                    maxy = Math.max(j, maxy);
                }

            }


        }

        if(minx == maxx && miny == maxy) {
            System.out.println("0");
        }
        // 다 같은 열에 있는 경우
        else if(minx == maxx) {
            int count = Math.min(maxy, N-miny-1);
            System.out.println(count);
        }
        // 다 같은 행에 있는 경우
        else if (miny == maxy){
            int count = Math.min(maxx, N-minx-1);
            System.out.println(count);
        }
        // 제 각각인 경우
        else {
            int countx = Math.min(maxy, N-miny-1);
            int county = Math.min(maxx, N-minx-1);
            System.out.println(countx + county);
        }
    }
}
