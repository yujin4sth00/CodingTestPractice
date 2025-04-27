import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 다음 Enter가 입력되어 지기 전까지 유저들은 한 번씩은 무조건 곰곰티콘 사용
        // 그 이후 같은 이름의 유저가 입력하는 채팅은 곰곰티콘 x 평범한 채팅이므로 user를 입력받기에 중복 x
        HashSet enterUser= new HashSet();

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=N; i>0; i--){
            String chatting = br.readLine();
            
            if(chatting.equals("ENTER")){
                count += enterUser.size();
                enterUser.clear();
                continue;
            }
            enterUser.add(chatting);
        }


        count += enterUser.size();

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
