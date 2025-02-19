import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine();

        int ans = 0;

        while(true){
            char lastAlp = B.charAt(B.length()-1);
            if(lastAlp == 'A'){
                B = B.substring(0, B.length()-1);
            }else if(lastAlp == 'B'){
                B = B.substring(0, B.length()-1);
                StringBuffer sb = new StringBuffer(B);
                B = sb.reverse().toString();
            }

            if(B.equals(A)){
                ans = 1;
                break;
            }

            if(B.length() == 1)
                break;
        }

        bw.write(ans + " ");
        bw.close();

    }
}