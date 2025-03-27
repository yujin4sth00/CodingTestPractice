import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st = new StringTokenizer( br.readLine() );
      int N = Integer.parseInt(st.nextToken());
      int L = Integer.parseInt(st.nextToken());
      
      int[] p = new int[N];
      st = new StringTokenizer( br.readLine() ); 
      for(int i=0;i < N; i++) {
    	  p[i] = Integer.parseInt(st.nextToken());
      }
      Arrays.sort(p);
      
      int t_count = 1;
      double tape = (p[0] - 0.5) + L;
      for( int i =1; i < N; i++) {
    	  if( tape < p[i]+0.5 ) {
    		  t_count++;
    		  tape = (p[i] - 0.5) + L;	  
    	  }
      }
      
      bw.write(t_count+"\n");
      
      bw.flush();
      bw.close();
      br.close();
   }   
}