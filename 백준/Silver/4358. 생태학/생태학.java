import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> treeMap = new HashMap<>();
        int totalCount = 0;
        
        String line;
        while ((line = br.readLine()) != null) {  // EOF까지 입력받기
            treeMap.put(line, treeMap.getOrDefault(line, 0) + 1);
            totalCount++;
        }
        
        // 사전순 정렬을 위해 TreeMap 사용
        TreeMap<String, Integer> sortedTreeMap = new TreeMap<>(treeMap);
        
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : sortedTreeMap.entrySet()) {
            String treeName = entry.getKey();
            int count = entry.getValue();
            double percentage = (count / (double) totalCount) * 100;
            sb.append(String.format("%s %.4f\n", treeName, percentage));
        }
        
        System.out.print(sb.toString());
    }
}
