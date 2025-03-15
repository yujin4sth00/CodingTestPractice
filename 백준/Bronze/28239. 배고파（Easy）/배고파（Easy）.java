import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder("");
        ArrayList<Long> arr=new ArrayList<>();
        HashMap<Long,Integer> map=new HashMap<>();
        int n=Integer.parseInt(br.readLine());
        int temp=0;
        for(long i=1; i<=1000000000000000000l; i*=2){
            arr.add(i);
            map.put(i,temp++);
        }
        for(int i=0; i<n; i++){
            long find=Long.parseLong(br.readLine());
            for(int j=0; j<arr.size(); j++){
                if(map.get(find-arr.get(j))!=null){
                    int index1=j;
                    int index2=map.get(find-arr.get(j));
                    sb.append(Math.min(index1,index2)+" "+Math.max(index1,index2)+"\n");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }

}