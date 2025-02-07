import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> books = new HashMap<>();
        int max = 0;
        for(int i = 0 ; i<n; i++){
            String key = br.readLine();
            books.put(key, books.getOrDefault(key, 0) + 1);
            max = Math.max(max, books.get(key));
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : books.entrySet()){
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}