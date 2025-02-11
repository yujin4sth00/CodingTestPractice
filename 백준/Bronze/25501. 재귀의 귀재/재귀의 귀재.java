import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
	static int count = 0; //recursion 호출 횟수 
	
    public static int recursion(String s, int l, int r){
        count+=1; 
    	if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
    	count=0; //recursion 호출 횟수 초기화 
        return recursion(s, 0, s.length()-1);
    }
    
    public static void main(String[] args) throws IOException
    {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	
    	int n = Integer.parseInt(br.readLine());
    	for(int i=0; i<n; i++)
    	{
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		String s = st.nextToken();
    		
    		bw.write(isPalindrome(s)+" "+count);
    		bw.newLine();
    	}
    	
    	bw.flush();
    	bw.close();
    	
    }
}